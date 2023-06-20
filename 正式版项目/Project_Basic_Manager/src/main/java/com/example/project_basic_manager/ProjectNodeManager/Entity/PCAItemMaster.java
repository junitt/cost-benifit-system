package com.example.project_basic_manager.ProjectNodeManager.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCAItemMaster {
    public PCAItemMaster(){}
    @Id
    @GeneratedValue
    private long id;
    private String carSystem;
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

    @JsonIgnoreProperties(value = {"item", "node"})
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy="item")
    List<PCAItemVersion> versionlist;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarSystem() {
        return carSystem;
    }

    public void setCarSystem(String carSystem) {
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

    @Override
    public String toString() {
        return "PCAItemMaster{" +
                "id=" + id +
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
                '}';
    }
}