package model;

import java.sql.Date;

public class ComplianceChecklists {

    private int id;
    private String checklistName;
    private String checklistDescription;
    private Date creationDate;
    private Date lastUpdated;
    private String reviewFrequency;
    private String complianceStandard;
    private String status;
    private Complaints complaintId;
    private Investigations investigationId;

    // Default constructor
    public ComplianceChecklists() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getChecklistName() {
        return checklistName;
    }

    public String getChecklistDescription() {
        return checklistDescription;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getReviewFrequency() {
        return reviewFrequency;
    }

    public String getComplianceStandard() {
        return complianceStandard;
    }

    public String getStatus() {
        return status;
    }

    public Complaints getComplaintId() {
        return complaintId;
    }

    public Investigations getInvestigationId() {
        return investigationId;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setChecklistName(String checklistName) {
        this.checklistName = checklistName;
    }

    public void setChecklistDescription(String checklistDescription) {
        this.checklistDescription = checklistDescription;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setReviewFrequency(String reviewFrequency) {
        this.reviewFrequency = reviewFrequency;
    }

    public void setComplianceStandard(String complianceStandard) {
        this.complianceStandard = complianceStandard;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setComplaintId(Complaints complaintId) {
        this.complaintId = complaintId;
    }

    public void setInvestigationId(Investigations investigationId) {
        this.investigationId = investigationId;
    }

}