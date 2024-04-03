package model;

import java.time.LocalDateTime;

public class ChecklistDefaultUsers {

    private Long id;
    private Checklists checklists;
    private Users users;
    private Tasks tasks;
    private Facilities facilities;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ChecklistDefaultUsers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Checklists getChecklists() {
        return checklists;
    }

    public void setChecklists(Checklists checklists) {
        this.checklists = checklists;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}