package model;

import java.sql.Timestamp;

public class DocumentTemplates {
    private int id;
    private String templateName;
    private String templateType;
    private Timestamp creationDate;
    private Timestamp lastModified;
    private String templateContent;
    private String approved;
    private Timestamp approvalDate;
    private int documentTemplateId;

    // Default constructor
    public DocumentTemplates() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public Timestamp getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Timestamp approvalDate) {
        this.approvalDate = approvalDate;
    }

    public int getDocumentTemplateId() {
        return documentTemplateId;
    }

    public void setDocumentTemplateId(int documentTemplateId) {
        this.documentTemplateId = documentTemplateId;
    }

    @Override
    public String toString() {
        return "DocumentTemplates{" +
                "id=" + id +
                ", templateName='" + templateName + '\'' +
                ", templateType='" + templateType + '\'' +
                ", creationDate=" + creationDate +
                ", lastModified=" + lastModified +
                ", templateContent='" + templateContent + '\'' +
                ", approved='" + approved + '\'' +
                ", approvalDate=" + approvalDate +
                ", documentTemplateId=" + documentTemplateId +
                '}';
    }
}