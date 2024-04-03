package model;

import java.time.LocalDateTime;

public class ChecklistDefaultUsers {
    private Long id;
    private Checklists checklistsId;
    private Users usersId;
    private Tasks tasksId;
    private Facilities facilitiesId;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private LocalDateTime deletedAt;

    public ChecklistDefaultUsers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Checklists getChecklistsId() {
        return checklistsId;
    }

    public void setChecklistsId(Checklists checklistsId) {
        this.checklistsId = checklistsId;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    public Tasks getTasksId() {
        return tasksId;
    }

    public void setTasksId(Tasks tasksId) {
        this.tasksId = tasksId;
    }

    public Facilities getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(Facilities facilitiesId) {
        this.facilitiesId = facilitiesId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
}