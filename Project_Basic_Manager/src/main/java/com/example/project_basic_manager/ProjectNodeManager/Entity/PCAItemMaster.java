package com.example.project_basic_manager.ProjectNodeManager.Entity;

import com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity.PCAItemCarSeries;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCAItemMaster {
    @Id
    @GeneratedValue
    private long id;

    private String unitId;
    private String unitName;
    private long carSystem;
    private String itemCode;
    private String itemName;
    private String itemType;
    private String itemDocument;
    private String carLevel;
    private String carClass;
    private String driveType;
    private String size;
    private String wheelBase;
    private String archiveFlag;
    private String archiveDate;
    private String blobFile;

    @JsonIgnoreProperties(value = {"item", "node","memo"})
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy="item")
    private List<PCAItemVersion> versionlist;
    @JsonIgnoreProperties(value={"itemlist","cartypelist"})
    @ManyToOne(cascade = CascadeType.PERSIST,optional = false)
    private PCAItemCarSeries carseriestype;

    public PCAItemMaster() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public long getCarSystem() {
        return carSystem;
    }

    public void setCarSystem(long carSystem) {
        this.carSystem = carSystem;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemDocument() {
        return itemDocument;
    }

    public void setItemDocument(String itemDocument) {
        this.itemDocument = itemDocument;
    }

    public String getCarLevel() {
        return carLevel;
    }

    public void setCarLevel(String carLevel) {
        this.carLevel = carLevel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWheelBase() {
        return wheelBase;
    }

    public void setWheelBase(String wheelBase) {
        this.wheelBase = wheelBase;
    }

    public String getArchiveFlag() {
        return archiveFlag;
    }

    public void setArchiveFlag(String archiveFlag) {
        this.archiveFlag = archiveFlag;
    }

    public String getArchiveDate() {
        return archiveDate;
    }

    public void setArchiveDate(String archiveDate) {
        this.archiveDate = archiveDate;
    }

    public String getBlobFile() {
        return blobFile;
    }

    public void setBlobFile(String blobFile) {
        this.blobFile = blobFile;
    }

    public PCAItemCarSeries getCarseriestype() {
        return carseriestype;
    }

    public void setCarseriestype(PCAItemCarSeries carseriestype) {
        this.carseriestype = carseriestype;
    }

    @Override
    public String toString() {
        return "PCAItemMaster{" +
                "id=" + id +
                ", unitId='" + unitId + '\'' +
                ", unitName='" + unitName + '\'' +
                ", carSystem='" + carSystem + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemDocument='" + itemDocument + '\'' +
                ", carLevel='" + carLevel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", driveType='" + driveType + '\'' +
                ", size='" + size + '\'' +
                ", wheelBase='" + wheelBase + '\'' +
                ", archiveFlag='" + archiveFlag + '\'' +
                ", archiveDate='" + archiveDate + '\'' +
                ", blobFile='" + blobFile + '\'' +
                ", versionlist=" + versionlist +
                ", carseriestype=" + carseriestype +
                '}';
    }

    public void SetAttribute(PCAItemMaster other) {
        this.id = other.id;
        this.unitId = other.unitId;
        this.unitName = other.unitName;
        this.carSystem = other.carSystem;
        this.itemCode = other.itemCode;
        this.itemName = other.itemName;
        this.itemType = other.itemType;
        this.itemDocument = other.itemDocument;
        this.carLevel = other.carLevel;
        this.carClass = other.carClass;
        this.driveType = other.driveType;
        this.size = other.size;
        this.wheelBase = other.wheelBase;
        this.archiveFlag = other.archiveFlag;
        this.archiveDate = other.archiveDate;
        this.blobFile = other.blobFile;
    }
}
