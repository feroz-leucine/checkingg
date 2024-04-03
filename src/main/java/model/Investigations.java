package model;

import java.util.Date;

public class Investigations {
    private int id;
    private String investigationName;
    private String status;
    private Date startDate;
    private Date endDate;
    private String methodology;
    private String findingsSummary;
    private String evidenceDetails;
    private String investigatorLead;
    private String priorityLevel;
    private int complaintId;
    private int investigationMethodId;
    private int investigationTeamId;
    private int investigationToolId;
    private int correctiveActionId;
    private int preventiveActionId;
    private int investigatorId;
    private int productImprovementId;

    public Investigations() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInvestigationName() {
        return investigationName;
    }

    public void setInvestigationName(String investigationName) {
        this.investigationName = investigationName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getMethodology() {
        return methodology;
    }

    public void setMethodology(String methodology) {
        this.methodology = methodology;
    }

    public String getFindingsSummary() {
        return findingsSummary;
    }

    public void setFindingsSummary(String findingsSummary) {
        this.findingsSummary = findingsSummary;
    }

    public String getEvidenceDetails() {
        return evidenceDetails;
    }

    public void setEvidenceDetails(String evidenceDetails) {
        this.evidenceDetails = evidenceDetails;
    }

    public String getInvestigatorLead() {
        return investigatorLead;
    }

    public void setInvestigatorLead(String investigatorLead) {
        this.investigatorLead = investigatorLead;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public int getInvestigationMethodId() {
        return investigationMethodId;
    }

    public void setInvestigationMethodId(int investigationMethodId) {
        this.investigationMethodId = investigationMethodId;
    }

    public int getInvestigationTeamId() {
        return investigationTeamId;
    }

    public void setInvestigationTeamId(int investigationTeamId) {
        this.investigationTeamId = investigationTeamId;
    }

    public int getInvestigationToolId() {
        return investigationToolId;
    }

    public void setInvestigationToolId(int investigationToolId) {
        this.investigationToolId = investigationToolId;
    }

    public int getCorrectiveActionId() {
        return correctiveActionId;
    }

    public void setCorrectiveActionId(int correctiveActionId) {
        this.correctiveActionId = correctiveActionId;
    }

    public int getPreventiveActionId() {
        return preventiveActionId;
    }

    public void setPreventiveActionId(int preventiveActionId) {
        this.preventiveActionId = preventiveActionId;
    }

    public int getInvestigatorId() {
        return investigatorId;
    }

    public void setInvestigatorId(int investigatorId) {
        this.investigatorId = investigatorId;
    }

    public int getProductImprovementId() {
        return productImprovementId;
    }

    public void setProductImprovementId(int productImprovementId) {
        this.productImprovementId = productImprovementId;
    }
}