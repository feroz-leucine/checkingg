package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

public class ComplianceReports {
    private Integer id;
    private String reportName;
    private LocalDate reportDate;
    private String reportStatus;
    private LocalDate submissionDeadline;
    private Integer numberOfComplaints;
    private Integer numberOfInvestigations;
    private Integer numberOfResolutions;
    private BigDecimal complianceScore;
    private String reportSummary;
    private String submittedBy;
    private String verifiedBy;
    private String reportFilePath;
    private String responseFromRegulatory;
    private Complaints complaint;
    private RegulatoryBodies regulatoryBody;

    public ComplianceReports() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public LocalDate getSubmissionDeadline() {
        return submissionDeadline;
    }

    public void setSubmissionDeadline(LocalDate submissionDeadline) {
        this.submissionDeadline = submissionDeadline;
    }

    public Integer getNumberOfComplaints() {
        return numberOfComplaints;
    }

    public void setNumberOfComplaints(Integer numberOfComplaints) {
        this.numberOfComplaints = numberOfComplaints;
    }

    public Integer getNumberOfInvestigations() {
        return numberOfInvestigations;
    }

    public void setNumberOfInvestigations(Integer numberOfInvestigations) {
        this.numberOfInvestigations = numberOfInvestigations;
    }

    public Integer getNumberOfResolutions() {
        return numberOfResolutions;
    }

    public void setNumberOfResolutions(Integer numberOfResolutions) {
        this.numberOfResolutions = numberOfResolutions;
    }

    public BigDecimal getComplianceScore() {
        return complianceScore;
    }

    public void setComplianceScore(BigDecimal complianceScore) {
        this.complianceScore = complianceScore;
    }

    public String getReportSummary() {
        return reportSummary;
    }

    public void setReportSummary(String reportSummary) {
        this.reportSummary = reportSummary;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    public String getReportFilePath() {
        return reportFilePath;
    }

    public void setReportFilePath(String reportFilePath) {
        this.reportFilePath = reportFilePath;
    }

    public String getResponseFromRegulatory() {
        return responseFromRegulatory;
    }

    public void setResponseFromRegulatory(String responseFromRegulatory) {
        this.responseFromRegulatory = responseFromRegulatory;
    }

    public Complaints getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaints complaint) {
        this.complaint = complaint;
    }

    public RegulatoryBodies getRegulatoryBody() {
        return regulatoryBody;
    }

    public void setRegulatoryBody(RegulatoryBodies regulatoryBody) {
        this.regulatoryBody = regulatoryBody;
    }
}