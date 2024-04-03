package model;

import java.util.Date;

public class InvestigationTools {
    private long id;
    private String toolName;
    private String toolType;
    private String description;
    private Date acquisitionDate;
    private String vendor;
    private String version;
    private String status;

    // Default constructor
    public InvestigationTools() {
    }

    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // ToString method for debugging purposes

    @Override
    public String toString() {
        return "InvestigationTools{" +
               "id=" + id +
               ", toolName='" + toolName + '\'' +
               ", toolType='" + toolType + '\'' +
               ", description='" + description + '\'' +
               ", acquisitionDate=" + acquisitionDate +
               ", vendor='" + vendor + '\'' +
               ", version='" + version + '\'' +
               ", status='" + status + '\'' +
               '}';
    }
}