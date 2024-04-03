package model;

import java.util.Date;

public class InvestigationTeams {
    private int id;
    private String teamName;
    private int teamLeadId;
    private String department;
    private String specialization;
    private Date creationDate;
    private String activeStatus;
    private int teamSize;

    // Default constructor
    public InvestigationTeams() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamLeadId() {
        return teamLeadId;
    }

    public void setTeamLeadId(int teamLeadId) {
        this.teamLeadId = teamLeadId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // toString Method for debugging and logging purposes
    @Override
    public String toString() {
        return "InvestigationTeams{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", teamLeadId=" + teamLeadId +
                ", department='" + department + '\'' +
                ", specialization='" + specialization + '\'' +
                ", creationDate=" + creationDate +
                ", activeStatus='" + activeStatus + '\'' +
                ", teamSize=" + teamSize +
                '}';
    }
}