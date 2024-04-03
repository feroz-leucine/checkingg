package model;

import java.sql.Timestamp;

public class Complainants {
    private int id;
    private String name;
    private String contactEmail;
    private String contactPhone;
    private String relationshipToProduct;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Complainants() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getRelationshipToProduct() {
        return relationshipToProduct;
    }

    public void setRelationshipToProduct(String relationshipToProduct) {
        this.relationshipToProduct = relationshipToProduct;
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
}