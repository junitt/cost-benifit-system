package com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class PCAItemCarType {
    private String BoxCode;
    private String BoxMtlCode;
    private String Code;
    private String GearboxType;
    private String carLevel;//级别
    private String carType;//细分种类SUV例如至尊suv

    @Id
    @GeneratedValue
    private long id;

    @JsonIgnoreProperties(value = {"cartypelist", "itemlist"})
    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    private PCAItemCarSeries carseriestype;
    @JsonIgnoreProperties(value = {"cartypelist"})
    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    private PCAItemGearBox gear;
    @JsonIgnoreProperties(value = {"cartypelist"})
    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    private PCAItemEngBox eng;

    public PCAItemCarType() {

    }

    public String getBoxCode() {
        return BoxCode;
    }

    public void setBoxCode(String boxCode) {
        BoxCode = boxCode;
    }

    public String getBoxMtlCode() {
        return BoxMtlCode;
    }

    public void setBoxMtlCode(String boxMtlCode) {
        BoxMtlCode = boxMtlCode;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getGearboxType() {
        return GearboxType;
    }

    public void setGearboxType(String gearboxType) {
        GearboxType = gearboxType;
    }

    public String getCarLevel() {
        return carLevel;
    }

    public void setCarLevel(String carLevel) {
        this.carLevel = carLevel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PCAItemCarSeries getCarseriestype() {
        return carseriestype;
    }

    public void setCarseriestype(PCAItemCarSeries carseriestype) {
        this.carseriestype = carseriestype;
    }

    public PCAItemGearBox getGear() {
        return gear;
    }

    public void setGear(PCAItemGearBox gear) {
        this.gear = gear;
    }

    public PCAItemEngBox getEng() {
        return eng;
    }

    public void setEng(PCAItemEngBox eng) {
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "PCAItemCarType{" +
                "BoxCode='" + BoxCode + '\'' +
                ", BoxMtlCode='" + BoxMtlCode + '\'' +
                ", Code='" + Code + '\'' +
                ", GearboxType='" + GearboxType + '\'' +
                ", carLevel='" + carLevel + '\'' +
                ", carType='" + carType + '\'' +
                ", id=" + id +
                ", carseriestype=" + carseriestype +
                ", gear=" + gear +
                ", eng=" + eng +
                '}';
    }
}
