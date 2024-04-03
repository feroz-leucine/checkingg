package model;

import java.util.Date;

public class RegulatorySubmissions {
    private int id;
    private Date submissionDate;
    private String submissionType;
    private String documentType;
    private String submissionStatus;
    private Date responseDueDate;
    private String responseReceived;
    private String fileHash;
    private String submissionComments;
    private UserAccounts userAccount;

    public RegulatorySubmissions() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(String submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    public Date getResponseDueDate() {
        return responseDueDate;
    }

    public void setResponseDueDate(Date responseDueDate) {
        this.responseDueDate = responseDueDate;
    }

    public String getResponseReceived() {
        return responseReceived;
    }

    public void setResponseReceived(String responseReceived) {
        this.responseReceived = responseReceived;
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public String getSubmissionComments() {
        return submissionComments;
    }

    public void setSubmissionComments(String submissionComments) {
        this.submissionComments = submissionComments;
    }

    public UserAccounts getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccounts userAccount) {
        this.userAccount = userAccount;
    }
}