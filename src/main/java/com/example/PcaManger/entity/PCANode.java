package com.example.PcaManger.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCANode {
    public PCANode(){}
    @Id
    @GeneratedValue
    private long id;
    private String ItemNode;
    private String ItemNodeName;
    private String CarNodePeriod;
    private String Seq;
    private String IsStop;
    private String StopDate;
    @JsonIgnoreProperties(value = {"item", "node"})
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy="node")
    List<PCAItemVersion> versionlist;
    public long getId(){
        return id;
    }
}
