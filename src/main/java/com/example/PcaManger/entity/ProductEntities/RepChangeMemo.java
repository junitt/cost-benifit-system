package com.example.PcaManger.entity.ProductEntities;

import com.example.PcaManger.entity.PCAItemVersion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class RepChangeMemo {
    public RepChangeMemo(){}
    @Id
    @GeneratedValue
    private long id;
    private String RepListCode;
    private String ItemChangeMemo;
    private String Item1;
    private String ItemChangeDate;
    @JsonIgnoreProperties(value={"node","item","memo"})
    @OneToMany(mappedBy="memo")
    List<PCAItemVersion> versionlist;
}
