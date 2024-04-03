package model;

import java.sql.Timestamp;
import java.time.Instant;

public class MasterIonExchangeColumns {

    private Long id;
    private String displayName;
    private String name;
    private String equipmentId;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Long createdBy;
    private Long updatedBy;
    private String usageStatus;
    private String productType;
    private Timestamp modifiedAt;
    private Integer lastManufacturedBatchId;
    private MasterBatches masterBatches;

    public MasterIonExchangeColumns() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Integer getLastManufacturedBatchId() {
        return lastManufacturedBatchId;
    }

    public void setLastManufacturedBatchId(Integer lastManufacturedBatchId) {
        this.lastManufacturedBatchId = lastManufacturedBatchId;
    }

    public MasterBatches getMasterBatches() {
        return masterBatches;
    }

    public void setMasterBatches(MasterBatches masterBatches) {
        this.masterBatches = masterBatches;
    }
}