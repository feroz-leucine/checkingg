package model;

import java.sql.Timestamp;

public class NotificationSettings {
    private int id;
    private int userId;
    private String receiveNewComplaintAlerts;
    private String receiveInvestigationUpdates;
    private String receiveActionReminders;
    private String emailNotificationsEnabled;
    private String smsNotificationsEnabled;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private UserAccounts userAccount;

    public NotificationSettings() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getReceiveNewComplaintAlerts() {
        return receiveNewComplaintAlerts;
    }

    public void setReceiveNewComplaintAlerts(String receiveNewComplaintAlerts) {
        this.receiveNewComplaintAlerts = receiveNewComplaintAlerts;
    }

    public String getReceiveInvestigationUpdates() {
        return receiveInvestigationUpdates;
    }

    public void setReceiveInvestigationUpdates(String receiveInvestigationUpdates) {
        this.receiveInvestigationUpdates = receiveInvestigationUpdates;
    }

    public String getReceiveActionReminders() {
        return receiveActionReminders;
    }

    public void setReceiveActionReminders(String receiveActionReminders) {
        this.receiveActionReminders = receiveActionReminders;
    }

    public String getEmailNotificationsEnabled() {
        return emailNotificationsEnabled;
    }

    public void setEmailNotificationsEnabled(String emailNotificationsEnabled) {
        this.emailNotificationsEnabled = emailNotificationsEnabled;
    }

    public String getSmsNotificationsEnabled() {
        return smsNotificationsEnabled;
    }

    public void setSmsNotificationsEnabled(String smsNotificationsEnabled) {
        this.smsNotificationsEnabled = smsNotificationsEnabled;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserAccounts getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccounts userAccount) {
        this.userAccount = userAccount;
    }
}