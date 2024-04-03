package model;

import java.sql.Timestamp;

public class AuditCriteria {

    private int id;
    private String criteriaName;
    private String description;
    private Timestamp createdDate;
    private Timestamp lastUpdated;
    private boolean activeStatus;
    private String complianceStandard;
    private int importanceLevel;

    public AuditCriteria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCriteriaName() {
        return criteriaName;
    }

    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getComplianceStandard() {
        return complianceStandard;
    }

    public void setComplianceStandard(String complianceStandard) {
        this.complianceStandard = complianceStandard;
    }

    public int getImportanceLevel() {
        return importanceLevel;
    }

    public void setImportanceLevel(int importanceLevel) {
        this.importanceLevel = importanceLevel;
    }

    @Override
    public String toString() {
        return "AuditCriteria{" +
                "id=" + id +
                ", criteriaName='" + criteriaName + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", lastUpdated=" + lastUpdated +
                ", activeStatus=" + activeStatus +
                ", complianceStandard='" + complianceStandard + '\'' +
                ", importanceLevel=" + importanceLevel +
                '}';
    }
}