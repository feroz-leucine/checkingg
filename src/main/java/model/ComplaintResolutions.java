package model;

import java.util.Date;

/**
 * Represents the resolutions provided for complaints within the system. It includes details about the
 * resolution type, status, satisfaction levels, and the specific complaint it addresses.
 */
public class ComplaintResolutions {
    private int id;
    private String resolutionType;
    private String resolutionStatus;
    private int satisfactionLevel;
    private String resolvedBy;
    private Date resolutionDate;
    private String resolutionDetails;
    private String additionalNotes;
    private double resolutionTime;
    private int complaintId; // Foreign key linking to Complaints class

    // Default constructor
    public ComplaintResolutions() {
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(String resolutionType) {
        this.resolutionType = resolutionType;
    }

    public String getResolutionStatus() {
        return resolutionStatus;
    }

    public void setResolutionStatus(String resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
    }

    public int getSatisfactionLevel() {
        return satisfactionLevel;
    }

    public void setSatisfactionLevel(int satisfactionLevel) {
        this.satisfactionLevel = satisfactionLevel;
    }

    public String getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public Date getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(Date resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public String getResolutionDetails() {
        return resolutionDetails;
    }

    public void setResolutionDetails(String resolutionDetails) {
        this.resolutionDetails = resolutionDetails;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public double getResolutionTime() {
        return resolutionTime;
    }

    public void setResolutionTime(double resolutionTime) {
        this.resolutionTime = resolutionTime;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }
}