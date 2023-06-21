package com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCAItemMaster;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCAItemCarSeries {
    @Id
    @GeneratedValue
    private long id;

    private String seriesType;//大种类SUV
    private String companyName;
    private String factoryLocation;

    @JsonIgnoreProperties(value = {"versionlist", "carseriestype"})
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "carseriestype")
    private List<PCAItemMaster> itemlist;
    @JsonIgnoreProperties(value = {"gear", "eng", "carseriestype"})
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "carseriestype")
    private List<PCAItemCarType> cartypelist;

    public PCAItemCarSeries() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(String seriesType) {
        this.seriesType = seriesType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFactoryLocation() {
        return factoryLocation;
    }

    public void setFactoryLocation(String factoryLocation) {
        this.factoryLocation = factoryLocation;
    }

    @Override
    public String toString() {
        return "PCAItemCarSeries{" +
                "id=" + id +
                ", seriesType='" + seriesType + '\'' +
                ", companyName='" + companyName + '\'' +
                ", factoryLocation='" + factoryLocation + '\'' +
                ", itemlist=" + itemlist +
                ", cartypelist=" + cartypelist +
                '}';
    }
}