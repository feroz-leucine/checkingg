package model;

import java.sql.Date;

public class ResolutionFeedback {

    private int id;
    private int satisfactionLevel;
    private String feedbackText;
    private Date submittedDate;
    private String improvementSuggested;
    private int resolutionRating;
    private ComplaintResolutions complaintResolution;

    // Default constructor
    public ResolutionFeedback() {
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSatisfactionLevel() {
        return satisfactionLevel;
    }

    public void setSatisfactionLevel(int satisfactionLevel) {
        this.satisfactionLevel = satisfactionLevel;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    public String getImprovementSuggested() {
        return improvementSuggested;
    }

    public void setImprovementSuggested(String improvementSuggested) {
        this.improvementSuggested = improvementSuggested;
    }

    public int getResolutionRating() {
        return resolutionRating;
    }

    public void setResolutionRating(int resolutionRating) {
        this.resolutionRating = resolutionRating;
    }

    public ComplaintResolutions getComplaintResolution() {
        return complaintResolution;
    }

    public void setComplaintResolution(ComplaintResolutions complaintResolution) {
        this.complaintResolution = complaintResolution;
    }

    // toString() method for printing
    @Override
    public String toString() {
        return "ResolutionFeedback{" +
                "id=" + id +
                ", satisfactionLevel=" + satisfactionLevel +
                ", feedbackText='" + feedbackText + '\'' +
                ", submittedDate=" + submittedDate +
                ", improvementSuggested='" + improvementSuggested + '\'' +
                ", resolutionRating=" + resolutionRating +
                ", complaintResolution=" + (complaintResolution != null ? complaintResolution.toString() : "null") +
                '}';
    }
}