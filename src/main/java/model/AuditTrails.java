package model;

import java.sql.Timestamp;

public class AuditTrails {
    
    private int id;
    private String actionType;
    private String description;
    private String performedBy;
    private Timestamp timestamp;
    private String affectedEntityType;
    private int affectedEntityId;
    private String changeSummary;

    public AuditTrails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getAffectedEntityType() {
        return affectedEntityType;
    }

    public void setAffectedEntityType(String affectedEntityType) {
        this.affectedEntityType = affectedEntityType;
    }

    public int getAffectedEntityId() {
        return affectedEntityId;
    }

    public void setAffectedEntityId(int affectedEntityId) {
        this.affectedEntityId = affectedEntityId;
    }

    public String getChangeSummary() {
        return changeSummary;
    }

    public void setChangeSummary(String changeSummary) {
        this.changeSummary = changeSummary;
    }

    @Override
    public String toString() {
        return "AuditTrails{" +
               "id=" + id +
               ", actionType='" + actionType + '\'' +
               ", description='" + description + '\'' +
               ", performedBy='" + performedBy + '\'' +
               ", timestamp=" + timestamp +
               ", affectedEntityType='" + affectedEntityType + '\'' +
               ", affectedEntityId=" + affectedEntityId +
               ", changeSummary='" + changeSummary + '\'' +
               '}';
    }
}