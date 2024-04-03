package model;

import java.util.Date;

public class ComplianceStandards {
    private int id;
    private String standardName;
    private String standardCode;
    private String description;
    private String regulatoryBody;
    private Date effectiveDate;
    private Date expirationDate;
    private String status;
    private Date createdAt;
    private Date updatedAt;

    // Default constructor
    public ComplianceStandards() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getStandardName() {
        return standardName;
    }

    public String getStandardCode() {
        return standardCode;
    }

    public String getDescription() {
        return description;
    }

    public String getRegulatoryBody() {
        return regulatoryBody;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRegulatoryBody(String regulatoryBody) {
        this.regulatoryBody = regulatoryBody;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}