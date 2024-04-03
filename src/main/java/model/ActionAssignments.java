package model;

import java.sql.Timestamp;
import java.util.Date;

public class ActionAssignments {
    private int id;
    private String actionType;
    private String assignedTo;
    private Date dueDate;
    private String status;
    private String priorityLevel;
    private String comments;
    private Timestamp creationDate;
    private Timestamp lastModifiedDate;
    private int correctiveActionId; // Assuming these refer to CorrectiveActions class
    private int preventiveActionId; // Assuming these refer to PreventiveActions class

    public ActionAssignments() {
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

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getCorrectiveActionId() {
        return correctiveActionId;
    }

    public void setCorrectiveActionId(int correctiveActionId) {
        this.correctiveActionId = correctiveActionId;
    }

    public int getPreventiveActionId() {
        return preventiveActionId;
    }

    public void setPreventiveActionId(int preventiveActionId) {
        this.preventiveActionId = preventiveActionId;
    }
}