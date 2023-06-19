package com.example.PcaManger.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PCAItemVersion {
    public PCAItemVersion(){}
    @Id
    @GeneratedValue
    private long id;
    private String VersionType;
    private String VersionCode;
    private String VersionName;
    private String VersionMemo;
    private String OfficialFlag;
    private String IssueFlag;

    @JsonIgnoreProperties("versionlist")
    @ManyToOne(optional = false)
    private PCANode node;//必须指定
    @JsonIgnoreProperties("versionlist")
    @ManyToOne(optional = false)
    private PCAItemMaster item;
}
