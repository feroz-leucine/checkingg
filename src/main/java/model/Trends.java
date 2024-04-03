package model;

import java.sql.Timestamp;
import java.util.Date;

public class Trends {
    private int id;
    private String trendName;
    private Date startDate;
    private Date endDate;
    private double trendValue;
    private String trendType;
    private String observationFrequency;
    private String metricUnit;
    private String commentary;
    private Timestamp creationDate;
    private Timestamp lastUpdated;

    public Trends() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrendName() {
        return trendName;
    }

    public void setTrendName(String trendName) {
        this.trendName = trendName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getTrendValue() {
        return trendValue;
    }

    public void setTrendValue(double trendValue) {
        this.trendValue = trendValue;
    }

    public String getTrendType() {
        return trendType;
    }

    public void setTrendType(String trendType) {
        this.trendType = trendType;
    }

    public String getObservationFrequency() {
        return observationFrequency;
    }

    public void setObservationFrequency(String observationFrequency) {
        this.observationFrequency = observationFrequency;
    }

    public String getMetricUnit() {
        return metricUnit;
    }

    public void setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
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

    @Override
    public String toString() {
        return "Trends{" +
                "id=" + id +
                ", trendName='" + trendName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", trendValue=" + trendValue +
                ", trendType='" + trendType + '\'' +
                ", observationFrequency='" + observationFrequency + '\'' +
                ", metricUnit='" + metricUnit + '\'' +
                ", commentary='" + commentary + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}