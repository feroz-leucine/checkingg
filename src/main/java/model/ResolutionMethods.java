package model;

import java.sql.Timestamp;

public class ResolutionMethods {

    private int id;
    private String methodName;
    private String description;
    private Double effectivenessRating;
    private String processLevel;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public ResolutionMethods() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getDescription() {
        return description;
    }

    public Double getEffectivenessRating() {
        return effectivenessRating;
    }

    public String getProcessLevel() {
        return processLevel;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEffectivenessRating(Double effectivenessRating) {
        this.effectivenessRating = effectivenessRating;
    }

    public void setProcessLevel(String processLevel) {
        this.processLevel = processLevel;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}