package model;

import java.sql.Date;

public class PreventiveActions {
    private int id;
    private String actionName;
    private String description;
    private Date actionDate;
    private Date expectedCompletionDate;
    private Date actualCompletionDate;
    private String status;
    private int effectivenessRating;
    private Date reviewDate;

    // Default constructor
    public PreventiveActions() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public Date getExpectedCompletionDate() {
        return expectedCompletionDate;
    }

    public void setExpectedCompletionDate(Date expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
    }

    public Date getActualCompletionDate() {
        return actualCompletionDate;
    }

    public void setActualCompletionDate(Date actualCompletionDate) {
        this.actualCompletionDate = actualCompletionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEffectivenessRating() {
        return effectivenessRating;
    }

    public void setEffectivenessRating(int effectivenessRating) {
        this.effectivenessRating = effectivenessRating;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}