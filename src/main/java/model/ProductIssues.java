package model;

import java.util.Date;

public class ProductIssues {
    private int id;
    private String issueCode;
    private String description;
    private String issueCategory;
    private String severityLevel;
    private Date dateIdentified;
    private String status;
    private Date resolutionDate;
    private int productIssueId; // Assuming this is a self-reference to another ProductIssues ID for related records

    public ProductIssues() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIssueCategory() {
        return issueCategory;
    }

    public void setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public Date getDateIdentified() {
        return dateIdentified;
    }

    public void setDateIdentified(Date dateIdentified) {
        this.dateIdentified = dateIdentified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(Date resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public int getProductIssueId() {
        return productIssueId;
    }

    public void setProductIssueId(int productIssueId) {
        this.productIssueId = productIssueId;
    }
}