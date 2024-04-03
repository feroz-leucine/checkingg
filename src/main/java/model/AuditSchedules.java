package model;

import java.util.Date;

public class AuditSchedules {
    private Integer id;
    private String auditName;
    private Date scheduledDate;
    private String auditor;
    private String auditScope;
    private String auditType;
    private String status;
    private Date creationDate;
    private Date lastModifiedDate;
    private String notes;
    private Integer auditScheduleId;

    public AuditSchedules() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getAuditScope() {
        return auditScope;
    }

    public void setAuditScope(String auditScope) {
        this.auditScope = auditScope;
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getAuditScheduleId() {
        return auditScheduleId;
    }

    public void setAuditScheduleId(Integer auditScheduleId) {
        this.auditScheduleId = auditScheduleId;
    }

    @Override
    public String toString() {
        return "AuditSchedules{" +
                "id=" + id +
                ", auditName='" + auditName + '\'' +
                ", scheduledDate=" + scheduledDate +
                ", auditor='" + auditor + '\'' +
                ", auditScope='" + auditScope + '\'' +
                ", auditType='" + auditType + '\'' +
                ", status='" + status + '\'' +
                ", creationDate=" + creationDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", notes='" + notes + '\'' +
                ", auditScheduleId=" + auditScheduleId +
                '}';
    }
}