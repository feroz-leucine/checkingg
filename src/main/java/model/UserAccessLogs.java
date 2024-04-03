package model;

import java.sql.Timestamp;

public class UserAccessLogs {
    private Long id;
    private int userId;
    private String actionType;
    private String entityType;
    private int recordId;
    private Timestamp timestamp;
    private String changesMade;
    private String ipAddress;
    private String sessionId;
    private UserAccounts userAccount;

    public UserAccessLogs() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getChangesMade() {
        return changesMade;
    }

    public void setChangesMade(String changesMade) {
        this.changesMade = changesMade;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public UserAccounts getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccounts userAccount) {
        this.userAccount = userAccount;
    }
}