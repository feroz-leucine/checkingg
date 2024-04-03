package model;

import java.sql.Date;

public class InvestigationFindings {

    private int id;
    private int investigationId;
    private String rootCause;
    private String findingSummary;
    private String actionRecommendation;
    private Date dateIdentified;
    private String investigationStatus;
    private String confirmedBy;
    private Date confirmationDate;

    public InvestigationFindings() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvestigationId() {
        return investigationId;
    }

    public void setInvestigationId(int investigationId) {
        this.investigationId = investigationId;
    }

    public String getRootCause() {
        return rootCause;
    }

    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    public String getFindingSummary() {
        return findingSummary;
    }

    public void setFindingSummary(String findingSummary) {
        this.findingSummary = findingSummary;
    }

    public String getActionRecommendation() {
        return actionRecommendation;
    }

    public void setActionRecommendation(String actionRecommendation) {
        this.actionRecommendation = actionRecommendation;
    }

    public Date getDateIdentified() {
        return dateIdentified;
    }

    public void setDateIdentified(Date dateIdentified) {
        this.dateIdentified = dateIdentified;
    }

    public String getInvestigationStatus() {
        return investigationStatus;
    }

    public void setInvestigationStatus(String investigationStatus) {
        this.investigationStatus = investigationStatus;
    }

    public String getConfirmedBy() {
        return confirmedBy;
    }

    public void setConfirmedBy(String confirmedBy) {
        this.confirmedBy = confirmedBy;
    }

    public Date getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    @Override
    public String toString() {
        return "InvestigationFindings{" +
                "id=" + id +
                ", investigationId=" + investigationId +
                ", rootCause='" + rootCause + '\'' +
                ", findingSummary='" + findingSummary + '\'' +
                ", actionRecommendation='" + actionRecommendation + '\'' +
                ", dateIdentified=" + dateIdentified +
                ", investigationStatus='" + investigationStatus + '\'' +
                ", confirmedBy='" + confirmedBy + '\'' +
                ", confirmationDate=" + confirmationDate +
                '}';
    }
}