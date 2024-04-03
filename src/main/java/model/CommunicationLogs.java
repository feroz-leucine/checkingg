package model;

import java.sql.Timestamp;

public class CommunicationLogs {
    private int id;
    private Timestamp communicationDate;
    private String communicationMode;
    private String communicationSummary;
    private String initiator;
    private String contactInformation;
    private String communicationStatus;
    private int communicationPriority;
    private Complaints complaintId;

    public CommunicationLogs() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCommunicationDate() {
        return communicationDate;
    }

    public void setCommunicationDate(Timestamp communicationDate) {
        this.communicationDate = communicationDate;
    }

    public String getCommunicationMode() {
        return communicationMode;
    }

    public void setCommunicationMode(String communicationMode) {
        this.communicationMode = communicationMode;
    }

    public String getCommunicationSummary() {
        return communicationSummary;
    }

    public void setCommunicationSummary(String communicationSummary) {
        this.communicationSummary = communicationSummary;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getCommunicationStatus() {
        return communicationStatus;
    }

    public void setCommunicationStatus(String communicationStatus) {
        this.communicationStatus = communicationStatus;
    }

    public int getCommunicationPriority() {
        return communicationPriority;
    }

    public void setCommunicationPriority(int communicationPriority) {
        this.communicationPriority = communicationPriority;
    }

    public Complaints getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Complaints complaintId) {
        this.complaintId = complaintId;
    }
}