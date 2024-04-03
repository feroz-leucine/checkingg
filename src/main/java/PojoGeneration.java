package admin.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import admin.io.leucine.dao.ProjectDAO;
import admin.io.leucine.model.Project;
import admin.io.leucine.model.Table;
import admin.io.leucine.model.TableColumn;
import admin.uv2.db.utils.DatabaseMetadataUtils;
import admin.uv2.db.utils.DatabaseUtilityExternal;
import admin.uv2.utils.HtmlExtractor;

public class PojoGeneration {

	public static void main(String[] args) {
		Project project = new ProjectDAO().getProjectById(208);
		String defaulPrepandString = "package admin.test;\n\n";
		try {
			List<Table> tables = new DatabaseMetadataUtils().getAllExternalTables(project);

			for (Table table : tables) {

				String pojoCode = generatePojoCode(table.getName(), table.getColumns());
				pojoCode = defaulPrepandString + pojoCode;
				System.out.println(pojoCode);
				System.out.println("===========================================");
				break;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getJavaDataType(String dataType) {
		String dataTypeLower = dataType.toLowerCase();
		switch (dataTypeLower) {
		case "varchar":
		case "char":
		case "text":
			return "String";
		case "int":
		case "integer":
		case "int4":
			return "Integer";
		case "bigint":
		case "int8":
		case "_int8": // Assuming this is a variant of bigint
			return "Long";
		case "boolean":
		case "bool":
			return "Boolean";
		case "double":
		case "double precision":
		case "float8":
		case "float64": // Assuming this maps to double in Java
			return "Double";
		case "float":
		case "real":
			return "Float";
		case "numeric":
			return "java.math.BigDecimal";
		case "date":
			return "java.sql.Date";
		case "datetime":
		case "timestamp":
		case "timestamp without time zone":
		case "timestamptz":
		case "timestamp with time zone":
			return "java.sql.Timestamp";
		case "time without time zone":
			return "java.sql.Time";
		case "jsonb":
			return "String";
		case "serial":
			return "Integer";

		default:
			return toCamelCaseEnum(dataTypeLower);
		}
	}

	private static String toCamelCaseEnum(String input) {
		StringBuilder result = new StringBuilder();
		boolean capitalizeNext = true;
		for (char c : input.toCharArray()) {
			if (c == '_' || c == ' ') {
				capitalizeNext = true;
			} else if (capitalizeNext) {
				result.append(Character.toUpperCase(c));
				capitalizeNext = false;
			} else {
				result.append(Character.toLowerCase(c));
			}
		}
		return result.toString();
	}

	public static String generatePojoCode(String tableName, ArrayList<TableColumn> tableColumns) {
		StringBuilder pojoCode = new StringBuilder();

		// Convert table name to CamelCase for the class name
		String className = toCamelCase(tableName, true);

		pojoCode.append("public class ").append(className).append(" {\n\n");

		// Generate fields with appropriate data types
		for (TableColumn tableColumn : tableColumns) {
			String fieldName = toCamelCase(tableColumn.getName(), false);
			String fieldType = getJavaDataType(tableColumn.getDataType()); // Use the dataType to determine the field
																			// type
			pojoCode.append("    private ").append(fieldType).append(" ").append(fieldName).append(";\n");
		}

		pojoCode.append("\n");

		// Generate getters and setters with appropriate return types and parameters
		for (TableColumn tableColumn : tableColumns) {
			String fieldName = toCamelCase(tableColumn.getName(), false);
			String methodName = toCamelCase(tableColumn.getName(), true);
			String fieldType = getJavaDataType(tableColumn.getDataType()); // Use the dataType for getter/setter

			// Getter
			pojoCode.append("    public ").append(fieldType).append(" get").append(methodName).append("() {\n")
					.append("        return this.").append(fieldName).append(";\n").append("    }\n\n");

			// Setter
			pojoCode.append("    public void set").append(methodName).append("(").append(fieldType).append(" ")
					.append(fieldName).append(") {\n").append("        this.").append(fieldName).append(" = ")
					.append(fieldName).append(";\n").append("    }\n\n");
		}

		pojoCode.append("}\n");

		return pojoCode.toString();
	}

	private static String toCamelCase(String input, boolean startWithCapital) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		StringBuilder camelCase = new StringBuilder();
		boolean makeNextUpperCase = startWithCapital;

		for (char c : input.toCharArray()) {
			if (c == '_' || c == ' ') {
				makeNextUpperCase = true;
			} else if (makeNextUpperCase) {
				camelCase.append(Character.toUpperCase(c));
				makeNextUpperCase = false;
			} else {
				camelCase.append(Character.toLowerCase(c));
			}
		}

		return camelCase.toString();
	}

}
