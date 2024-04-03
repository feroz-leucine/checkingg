package model;

import java.sql.Timestamp;

public class RegulatoryBodies {

    private int id;
    private String name;
    private String contactInfo;
    private String jurisdiction;
    private String accreditationDetails;
    private String websiteUrl;

    public RegulatoryBodies() {
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

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getAccreditationDetails() {
        return accreditationDetails;
    }

    public void setAccreditationDetails(String accreditationDetails) {
        this.accreditationDetails = accreditationDetails;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Override
    public String toString() {
        return "RegulatoryBodies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", jurisdiction='" + jurisdiction + '\'' +
                ", accreditationDetails='" + accreditationDetails + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                '}';
    }
}