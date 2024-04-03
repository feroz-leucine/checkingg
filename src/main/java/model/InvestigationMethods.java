package model;

import java.sql.Timestamp;

public class InvestigationMethods {

    private int id;
    private String methodName;
    private String description;
    private Double effectivenessRating;
    private String processLevel;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private int investigationMethodId;

    // Constructor
    public InvestigationMethods() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getEffectivenessRating() {
        return effectivenessRating;
    }

    public void setEffectivenessRating(Double effectivenessRating) {
        this.effectivenessRating = effectivenessRating;
    }

    public String getProcessLevel() {
        return processLevel;
    }

    public void setProcessLevel(String processLevel) {
        this.processLevel = processLevel;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getInvestigationMethodId() {
        return investigationMethodId;
    }

    public void setInvestigationMethodId(int investigationMethodId) {
        this.investigationMethodId = investigationMethodId;
    }

    // toString method for logging or debugging purposes
    @Override
    public String toString() {
        return "InvestigationMethods{" +
                "id=" + id +
                ", methodName='" + methodName + '\'' +
                ", description='" + description + '\'' +
                ", effectivenessRating=" + effectivenessRating +
                ", processLevel='" + processLevel + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", investigationMethodId=" + investigationMethodId +
                '}';
    }
}