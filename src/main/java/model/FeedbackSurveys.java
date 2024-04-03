package model;

import java.util.Date;

public class FeedbackSurveys {
    private int id;
    private String surveyName;
    private Date creationDate;
    private String completionStatus;
    private int satisfactionRating;
    private String feedbackComments;
    private Date surveySentDate;
    private Date responseDeadline;
    private String surveyVersion;
    private int complaintId;

    // Default Constructor
    public FeedbackSurveys() {
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    public int getSatisfactionRating() {
        return satisfactionRating;
    }

    public void setSatisfactionRating(int satisfactionRating) {
        this.satisfactionRating = satisfactionRating;
    }

    public String getFeedbackComments() {
        return feedbackComments;
    }

    public void setFeedbackComments(String feedbackComments) {
        this.feedbackComments = feedbackComments;
    }

    public Date getSurveySentDate() {
        return surveySentDate;
    }

    public void setSurveySentDate(Date surveySentDate) {
        this.surveySentDate = surveySentDate;
    }

    public Date getResponseDeadline() {
        return responseDeadline;
    }

    public void setResponseDeadline(Date responseDeadline) {
        this.responseDeadline = responseDeadline;
    }

    public String getSurveyVersion() {
        return surveyVersion;
    }

    public void setSurveyVersion(String surveyVersion) {
        this.surveyVersion = surveyVersion;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }
}