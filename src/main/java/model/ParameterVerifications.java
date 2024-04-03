package model;

public class ParameterVerifications {

    private Long id;
    private String comments;
    private Long jobsId;
    private Long parameterValuesId;
    private String verificationStatus;
    private String verificationType;
    private Long createdAt;
    private Long createdBy;
    private Long modifiedBy;
    private Long modifiedAt;
    private Long usersId;
    private Jobs jobs;
    private ParameterValues parameterValues;

    public ParameterVerifications() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getJobsId() {
        return jobsId;
    }

    public void setJobsId(Long jobsId) {
        this.jobsId = jobsId;
    }

    public Long getParameterValuesId() {
        return parameterValuesId;
    }

    public void setParameterValuesId(Long parameterValuesId) {
        this.parameterValuesId = parameterValuesId;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(String verificationType) {
        this.verificationType = verificationType;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Long getUsersId() {
        return usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public ParameterValues getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(ParameterValues parameterValues) {
        this.parameterValues = parameterValues;
    }
}