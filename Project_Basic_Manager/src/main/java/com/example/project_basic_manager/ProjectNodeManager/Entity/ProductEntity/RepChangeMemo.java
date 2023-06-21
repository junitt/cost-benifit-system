package com.example.project_basic_manager.ProjectNodeManager.Entity.ProductEntity;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCAItemVersion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class RepChangeMemo {
    @Id
    @GeneratedValue
    private long id;

    private String RepListCode;
    private String ItemChangeMemo;
    private String Item1;
    private String ItemChangeDate;

    @JsonIgnoreProperties(value = {"node", "item", "memo"})
    @OneToMany(mappedBy = "memo")
    List<PCAItemVersion> versionlist;

    public RepChangeMemo() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRepListCode() {
        return RepListCode;
    }

    public void setRepListCode(String repListCode) {
        RepListCode = repListCode;
    }

    public String getItemChangeMemo() {
        return ItemChangeMemo;
    }

    public void setItemChangeMemo(String itemChangeMemo) {
        ItemChangeMemo = itemChangeMemo;
    }

    public String getItem1() {
        return Item1;
    }

    public void setItem1(String item1) {
        Item1 = item1;
    }

    public String getItemChangeDate() {
        return ItemChangeDate;
    }

    public void setItemChangeDate(String itemChangeDate) {
        ItemChangeDate = itemChangeDate;
    }

    @Override
    public String toString() {
        return "RepChangeMemo{" +
                "id=" + id +
                ", RepListCode='" + RepListCode + '\'' +
                ", ItemChangeMemo='" + ItemChangeMemo + '\'' +
                ", Item1='" + Item1 + '\'' +
                ", ItemChangeDate='" + ItemChangeDate + '\'' +
                ", versionlist=" + versionlist +
                '}';
    }
}
