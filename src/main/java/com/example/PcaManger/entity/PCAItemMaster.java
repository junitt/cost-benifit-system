package com.example.PcaManger.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCAItemMaster {
    public PCAItemMaster(){}
    @Id
    @GeneratedValue
    private long id;
    private String CarSystem;
    private String ItemCode;
    private String ItemName;
    private String ItemType;
    private String ItemDocument;
    private String CarLevel;
    private String CarClass;
    private String DriveType;
    private String Size;
    private String WheelBase;
    private String ArchiveFlag;
    private String ArchiveDate;
    private String BlobFile;

    @JsonIgnoreProperties(value = {"item", "node"})
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy="item")
    List<PCAItemVersion> versionlist;

}
