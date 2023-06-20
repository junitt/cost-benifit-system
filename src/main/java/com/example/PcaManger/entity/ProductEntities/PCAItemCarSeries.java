package com.example.PcaManger.entity.ProductEntities;

import com.example.PcaManger.entity.PCAItemMaster;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCAItemCarSeries {
    public PCAItemCarSeries(){}
    @Id
    @GeneratedValue
    private long id;
    private String seriesType;//大种类SUV
    private String companyName;
    private String factoryLocation;
    @JsonIgnoreProperties(value={"versionlist","carseriestype"})
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "carseriestype")
    private List<PCAItemMaster> itemlist;
    @JsonIgnoreProperties(value={"gear","eng","carseriestype"})
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "carseriestype")
    private List<PCAItemCarType>cartypelist;

}
