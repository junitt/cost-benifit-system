package com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCAItemGearBox {
    @Id
    @GeneratedValue
    private long id;

    private String BoxCode;
    private String BoxMtlCode;
    private String Code;
    private String GearboxType;
    private String Name;

    @JsonIgnoreProperties(value = {"gear", "eng", "carseriestype"})
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "gear")
    private List<PCAItemCarType> cartypelist;

    public PCAItemGearBox() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "PCAItemGearBox{" +
                "id=" + id +
                ", BoxCode='" + BoxCode + '\'' +
                ", BoxMtlCode='" + BoxMtlCode + '\'' +
                ", Code='" + Code + '\'' +
                ", GearboxType='" + GearboxType + '\'' +
                ", Name='" + Name + '\'' +
                ", cartypelist=" + cartypelist +
                '}';
    }
}
