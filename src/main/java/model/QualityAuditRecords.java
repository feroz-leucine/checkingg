package model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Represents a record of a quality audit within the system.
 */
public class QualityAuditRecords {

    private int id;
    private Date auditDate;
    private String auditOutcome;
    private String auditorName;
    private String findingsSummary;
    private String recommendations;
    private String auditScope;
    private Date nextAuditDate;
    private String auditMethodology;
    private float auditDuration;

    public QualityAuditRecords() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditOutcome() {
        return auditOutcome;
    }

    public void setAuditOutcome(String auditOutcome) {
        this.auditOutcome = auditOutcome;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getFindingsSummary() {
        return findingsSummary;
    }

    public void setFindingsSummary(String findingsSummary) {
        this.findingsSummary = findingsSummary;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public String getAuditScope() {
        return auditScope;
    }

    public void setAuditScope(String auditScope) {
        this.auditScope = auditScope;
    }

    public Date getNextAuditDate() {
        return nextAuditDate;
    }

    public void setNextAuditDate(Date nextAuditDate) {
        this.nextAuditDate = nextAuditDate;
    }

    public String getAuditMethodology() {
        return auditMethodology;
    }

    public void setAuditMethodology(String auditMethodology) {
        this.auditMethodology = auditMethodology;
    }

    public float getAuditDuration() {
        return auditDuration;
    }

    public void setAuditDuration(float auditDuration) {
        this.auditDuration = auditDuration;
    }

    @Override
    public String toString() {
        return "QualityAuditRecords{" +
                "id=" + id +
                ", auditDate=" + auditDate +
                ", auditOutcome='" + auditOutcome + '\'' +
                ", auditorName='" + auditorName + '\'' +
                ", findingsSummary='" + findingsSummary + '\'' +
                ", recommendations='" + recommendations + '\'' +
                ", auditScope='" + auditScope + '\'' +
                ", nextAuditDate=" + nextAuditDate +
                ", auditMethodology='" + auditMethodology + '\'' +
                ", auditDuration=" + auditDuration +
                '}';
    }
}