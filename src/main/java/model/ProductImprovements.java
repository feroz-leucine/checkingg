package model;

import java.util.Date;

public class ProductImprovements {

    private int id;
    private String improvementName;
    private String improvementType;
    private String description;
    private Date implementedDate;
    private String impactAssessment;
    private String status;
    private String reviewedBy;
    private String feedbackSummary;
    private double associatedCost;

    public ProductImprovements() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImprovementName() {
        return improvementName;
    }

    public void setImprovementName(String improvementName) {
        this.improvementName = improvementName;
    }

    public String getImprovementType() {
        return improvementType;
    }

    public void setImprovementType(String improvementType) {
        this.improvementType = improvementType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getImplementedDate() {
        return implementedDate;
    }

    public void setImplementedDate(Date implementedDate) {
        this.implementedDate = implementedDate;
    }

    public String getImpactAssessment() {
        return impactAssessment;
    }

    public void setImpactAssessment(String impactAssessment) {
        this.impactAssessment = impactAssessment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(String reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public String getFeedbackSummary() {
        return feedbackSummary;
    }

    public void setFeedbackSummary(String feedbackSummary) {
        this.feedbackSummary = feedbackSummary;
    }

    public double getAssociatedCost() {
        return associatedCost;
    }

    public void setAssociatedCost(double associatedCost) {
        this.associatedCost = associatedCost;
    }
}