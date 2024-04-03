package model;

import java.sql.Timestamp;

public class ComplaintCategories {
    private int id;
    private String categoryName;
    private String description;
    private Timestamp creationDate;
    private Timestamp lastUpdated;
    private String categoryCode;
    private boolean isActive;
    private int complaintCategoryId;

    public ComplaintCategories() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getComplaintCategoryId() {
        return complaintCategoryId;
    }

    public void setComplaintCategoryId(int complaintCategoryId) {
        this.complaintCategoryId = complaintCategoryId;
    }
}