package model;

import java.sql.Date;
import java.sql.Timestamp;

public class CorrectiveActions {

    private int id;
    private String actionDescription;
    private String assignedTo;
    private Date deadline;
    private String status;
    private Timestamp creationDate;
    private Date completionDate;
    private double effectivenessRating;
    private Investigations investigation;
    private ActionStatuses actionStatus;
    private ActionAssignments actionAssignment;

    public CorrectiveActions() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public double getEffectivenessRating() {
        return effectivenessRating;
    }

    public void setEffectivenessRating(double effectivenessRating) {
        this.effectivenessRating = effectivenessRating;
    }

    public Investigations getInvestigation() {
        return investigation;
    }

    public void setInvestigation(Investigations investigation) {
        this.investigation = investigation;
    }

    public ActionStatuses getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(ActionStatuses actionStatus) {
        this.actionStatus = actionStatus;
    }

    public ActionAssignments getActionAssignment() {
        return actionAssignment;
    }

    public void setActionAssignment(ActionAssignments actionAssignment) {
        this.actionAssignment = actionAssignment;
    }
}