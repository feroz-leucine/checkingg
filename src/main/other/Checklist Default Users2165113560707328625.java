package model;

public class ChecklistDefaultUsers {
    private Long id;
    private Long checklistsId1;
    private Long checklistsId2;
    private Long usersId1;
    private Long usersId2;
    private Long tasksId1;
    private Long tasksId2;
    private Long facilitiesId;

    public ChecklistDefaultUsers() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChecklistsId1() {
        return checklistsId1;
    }

    public void setChecklistsId1(Long checklistsId1) {
        this.checklistsId1 = checklistsId1;
    }

    public Long getChecklistsId2() {
        return checklistsId2;
    }

    public void setChecklistsId2(Long checklistsId2) {
        this.checklistsId2 = checklistsId2;
    }

    public Long getUsersId1() {
        return usersId1;
    }

    public void setUsersId1(Long usersId1) {
        this.usersId1 = usersId1;
    }

    public Long getUsersId2() {
        return usersId2;
    }

    public void setUsersId2(Long usersId2) {
        this.usersId2 = usersId2;
    }

    public Long getTasksId1() {
        return tasksId1;
    }

    public void setTasksId1(Long tasksId1) {
        this.tasksId1 = tasksId1;
    }

    public Long getTasksId2() {
        return tasksId2;
    }

    public void setTasksId2(Long tasksId2) {
        this.tasksId2 = tasksId2;
    }

    public Long getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(Long facilitiesId) {
        this.facilitiesId = facilitiesId;
    }
}