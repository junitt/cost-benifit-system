package com.example.PcaManger.entity.ProductEntities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCAItemEngBox {
    public PCAItemEngBox(){}
    @Id
    @GeneratedValue
    private long id;
    private String BoxCode;
    private String BoxMtlCode;
    private String Code;
    private String GearboxType;
    private String Name;
    @JsonIgnoreProperties(value={"gear","eng","carseriestype"})
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "eng")
    private List<PCAItemCarType>cartypelist;
}
