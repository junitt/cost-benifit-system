package com.example.project_basic_manager.ProjectNodeManager.Entity;

import com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity.RepChangeMemo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PCAItemVersion {
    @Id
    @GeneratedValue
    private long id;

    private String versionType;
    private String versionCode;
    private String versionName;
    private String versionMemo;
    private String officialFlag;
    private String issueFlag;

    @JsonIgnoreProperties("versionlist")
    @ManyToOne(optional = false)
    private PCANode node;//必须指定
    @JsonIgnoreProperties("versionlist")
    @ManyToOne(optional = false)
    private PCAItemMaster item;
    @JsonIgnoreProperties("versionlist")
    @ManyToOne(optional = true)
    private RepChangeMemo memo;

    public PCAItemVersion() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionMemo() {
        return versionMemo;
    }

    public void setVersionMemo(String versionMemo) {
        this.versionMemo = versionMemo;
    }

    public String getOfficialFlag() {
        return officialFlag;
    }

    public void setOfficialFlag(String officialFlag) {
        this.officialFlag = officialFlag;
    }

    public String getIssueFlag() {
        return issueFlag;
    }

    public void setIssueFlag(String issueFlag) {
        this.issueFlag = issueFlag;
    }

    public PCANode getNode() {
        return node;
    }

    public void setNode(PCANode node) {
        this.node = node;
    }

    public PCAItemMaster getItem() {
        return item;
    }

    public void setItem(PCAItemMaster item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "PCAItemVersion{" +
                "id=" + id +
                ", versionType='" + versionType + '\'' +
                ", versionCode='" + versionCode + '\'' +
                ", versionName='" + versionName + '\'' +
                ", versionMemo='" + versionMemo + '\'' +
                ", officialFlag='" + officialFlag + '\'' +
                ", issueFlag='" + issueFlag + '\'' +
                ", node=" + node +
                ", item=" + item +
                ", memo=" + memo +
                '}';
    }

    public void SetAttributes(PCAItemVersion other) {
        this.id = other.id;
        this.versionType = other.versionType;
        this.versionCode = other.versionCode;
        this.versionName = other.versionName;
        this.versionMemo = other.versionMemo;
        this.officialFlag = other.officialFlag;
        this.issueFlag = other.issueFlag;
        this.node = other.node;
        this.item = other.item;
    }
}