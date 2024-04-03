package model;

import java.util.Date;

public class StakeholderEngagements {

    private int id;
    private String engagementType;
    private Date engagementDate;
    private String stakeholderName;
    private String engagementSummary;
    private String engagementLocation;
    private double engagementDuration;
    private String followUpRequired;
    private Date followUpDate;
    private String engagementStatus;

    public StakeholderEngagements() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEngagementType() {
        return engagementType;
    }

    public void setEngagementType(String engagementType) {
        this.engagementType = engagementType;
    }

    public Date getEngagementDate() {
        return engagementDate;
    }

    public void setEngagementDate(Date engagementDate) {
        this.engagementDate = engagementDate;
    }

    public String getStakeholderName() {
        return stakeholderName;
    }

    public void setStakeholderName(String stakeholderName) {
        this.stakeholderName = stakeholderName;
    }

    public String getEngagementSummary() {
        return engagementSummary;
    }

    public void setEngagementSummary(String engagementSummary) {
        this.engagementSummary = engagementSummary;
    }

    public String getEngagementLocation() {
        return engagementLocation;
    }

    public void setEngagementLocation(String engagementLocation) {
        this.engagementLocation = engagementLocation;
    }

    public double getEngagementDuration() {
        return engagementDuration;
    }

    public void setEngagementDuration(double engagementDuration) {
        this.engagementDuration = engagementDuration;
    }

    public String getFollowUpRequired() {
        return followUpRequired;
    }

    public void setFollowUpRequired(String followUpRequired) {
        this.followUpRequired = followUpRequired;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public String getEngagementStatus() {
        return engagementStatus;
    }

    public void setEngagementStatus(String engagementStatus) {
        this.engagementStatus = engagementStatus;
    }

    @Override
    public String toString() {
        return "StakeholderEngagements{" +
                "id=" + id +
                ", engagementType='" + engagementType + '\'' +
                ", engagementDate=" + engagementDate +
                ", stakeholderName='" + stakeholderName + '\'' +
                ", engagementSummary='" + engagementSummary + '\'' +
                ", engagementLocation='" + engagementLocation + '\'' +
                ", engagementDuration=" + engagementDuration +
                ", followUpRequired='" + followUpRequired + '\'' +
                ", followUpDate=" + followUpDate +
                ", engagementStatus='" + engagementStatus + '\'' +
                '}';
    }
}