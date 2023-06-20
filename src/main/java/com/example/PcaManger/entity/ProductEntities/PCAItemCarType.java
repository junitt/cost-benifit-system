package com.example.PcaManger.entity.ProductEntities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class PCAItemCarType {
    public PCAItemCarType(){}
    private String BoxCode;
    private String BoxMtlCode;
    private String Code;
    private String GearboxType;
    private String carLevel;//级别
    private String carType;//细分种类SUV例如至尊suv

    @Id
    @GeneratedValue
    private long id;
    @JsonIgnoreProperties(value={"cartypelist","itemlist"})
    @ManyToOne(cascade = CascadeType.PERSIST,optional = false)
    private PCAItemCarSeries carseriestype;
    @JsonIgnoreProperties(value={"cartypelist"})
    @ManyToOne(cascade = CascadeType.PERSIST,optional = false)
    private PCAItemGearBox gear;
    @JsonIgnoreProperties(value={"cartypelist"})
    @ManyToOne(cascade = CascadeType.PERSIST,optional = false)
    private PCAItemEngBox eng;

}
