package model;

import java.sql.Date;
import java.math.BigDecimal;

public class TrainingRecords {
    private int id;
    private String trainingTopic;
    private Date trainingDate;
    private BigDecimal durationHours;
    private String trainerName;
    private String location;
    private String attendanceStatus;
    private BigDecimal feedbackScore;
    private int userAccountId;

    public TrainingRecords() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainingTopic() {
        return trainingTopic;
    }

    public void setTrainingTopic(String trainingTopic) {
        this.trainingTopic = trainingTopic;
    }

    public Date getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
    }

    public BigDecimal getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(BigDecimal durationHours) {
        this.durationHours = durationHours;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public BigDecimal getFeedbackScore() {
        return feedbackScore;
    }

    public void setFeedbackScore(BigDecimal feedbackScore) {
        this.feedbackScore = feedbackScore;
    }

    public int getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(int userAccountId) {
        this.userAccountId = userAccountId;
    }
}