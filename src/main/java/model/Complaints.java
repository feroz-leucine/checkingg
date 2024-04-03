package model;

import java.sql.Date;

public class Complaints {
    private int id;
    private String complaintCode;
    private int productId;
    private Date complaintDate;
    private String complaintDetails;
    private String complaintSource;
    private String complaintPriority;
    private String complaintStatus;
    private Date resolutionDate;
    private String customerFeedback;
    private int complainantId;

    public Complaints() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComplaintCode() {
        return complaintCode;
    }

    public void setComplaintCode(String complaintCode) {
        this.complaintCode = complaintCode;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(Date complaintDate) {
        this.complaintDate = complaintDate;
    }

    public String getComplaintDetails() {
        return complaintDetails;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }

    public String getComplaintSource() {
        return complaintSource;
    }

    public void setComplaintSource(String complaintSource) {
        this.complaintSource = complaintSource;
    }

    public String getComplaintPriority() {
        return complaintPriority;
    }

    public void setComplaintPriority(String complaintPriority) {
        this.complaintPriority = complaintPriority;
    }

    public String getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public Date getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(Date resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    public int getComplainantId() {
        return complainantId;
    }

    public void setComplainantId(int complainantId) {
        this.complainantId = complainantId;
    }
}