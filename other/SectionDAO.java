package application.builder.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import admin.uv2.db.utils.DatabaseUtility;
import application.builder.model.Section;

public class SectionDAO {
	private static final Logger LOGGER = Logger.getLogger(SectionDAO.class.getName());

	/**
	 * Inserts a new Section into the database.
	 * 
	 * @param section The Section object to insert.
	 * @return The ID of the inserted Section, or -1 if insertion failed.
	 */
	public int insertSection(Section section) {
		String sql = "INSERT INTO sections (page_id, name, description, validation_rules, size) VALUES (?, ?, ?, ?, ?) RETURNING id";
		HashMap<Integer, Object> params = new HashMap<>();
		params.put(1, section.pageId);
		params.put(2, section.name);
		params.put(3, section.description);
		params.put(4, section.validationRules);
		params.put(5, section.size);

		try {
			return DatabaseUtility.updateObject(sql, params);
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error inserting Section: " + e.getMessage(), e);
			return -1;
		}
	}

	/**
	 * Updates an existing Section in the database.
	 * 
	 * @param section The Section object to update.
	 * @return true if the update was successful, false otherwise.
	 */
	public boolean updateSection(Section section) {
		String sql = "UPDATE sections SET page_id = ?, name = ?, description = ?, validation_rules = ?, size = ? WHERE id = ?";
		HashMap<Integer, Object> params = new HashMap<>();
		params.put(1, section.pageId);
		params.put(2, section.name);
		params.put(3, section.description);
		params.put(4, section.validationRules);
		params.put(5, section.size);
		params.put(6, section.id);

		try {
			int rowsAffected = DatabaseUtility.updateObject(sql, params);
			return rowsAffected > 0;
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error updating Section: " + e.getMessage(), e);
			return false;
		}
	}

	/**
	 * Deletes a Section from the database.
	 * 
	 * @param sectionId The ID of the Section to delete.
	 * @return true if the deletion was successful, false otherwise.
	 */
	public boolean deleteSection(int sectionId) {
		String sql = "DELETE FROM sections WHERE id = ?";
		HashMap<Integer, Object> params = new HashMap<>();
		params.put(1, sectionId);

		try {
			int rowsAffected = DatabaseUtility.updateObject(sql, params);
			return rowsAffected > 0;
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error deleting Section: " + e.getMessage(), e);
			return false;
		}
	}

	/**
	 * Retrieves a Section by its ID.
	 * 
	 * @param sectionId The ID of the Section to retrieve.
	 * @return A Section object if found, null otherwise.
	 */
	public Section getSectionById(int sectionId) {
		String sql = "SELECT * FROM sections WHERE id = ?";
		List<Object> params = new ArrayList<>();
		params.add(sectionId);

		try {
			ArrayList<HashMap<String, String>> results = DatabaseUtility.executeQueryForPreview(sql, params);
			if (!results.isEmpty()) {
				HashMap<String, String> row = results.get(0);
				Section section = new Section();
				section.id = Integer.parseInt(row.get("id"));
				section.pageId = row.get("page_id") != null ? Integer.parseInt(row.get("page_id")) : null;
				section.name = row.get("name");
				section.description = row.get("description");
				section.validationRules = row.get("validation_rules");
				section.size = row.get("size");
				return section;
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error retrieving Section by ID: " + e.getMessage(), e);
		}
		return null;
	}

	public List<Section> getSectionsByPageId(int pageId) {
		List<Section> sections = new ArrayList<>();
		String sql = "SELECT * FROM sections WHERE page_id = ?";
		List<Object> params = new ArrayList<>();
		params.add(pageId);

		try {
			ArrayList<HashMap<String, String>> results = DatabaseUtility.executeQueryForPreview(sql, params);
			for (HashMap<String, String> row : results) {
				Section section = new Section();
				section.id = Integer.parseInt(row.get("id"));
				section.pageId = row.get("page_id") != null ? Integer.parseInt(row.get("page_id")) : null;
				section.name = row.get("name");
				section.description = row.get("description");
				section.validationRules = row.get("validation_rules");
				section.size = row.get("size");
				sections.add(section);
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error retrieving Sections by Page ID: " + pageId, e);
		}
		return sections;
	}

	// Additional methods (e.g., list all Sections, find by pageId, etc.) can be
	// implemented here as needed.
}
