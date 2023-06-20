package com.example.project_basic_manager.ProjectNodeManager.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCANode {
    public PCANode() {

    }

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
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "node")
    List<PCAItemVersion> versionlist;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemNode() {
        return ItemNode;
    }

    public void setItemNode(String itemNode) {
        ItemNode = itemNode;
    }

    public String getItemNodeName() {
        return ItemNodeName;
    }

    public void setItemNodeName(String itemNodeName) {
        ItemNodeName = itemNodeName;
    }

    public String getCarNodePeriod() {
        return CarNodePeriod;
    }

    public void setCarNodePeriod(String carNodePeriod) {
        CarNodePeriod = carNodePeriod;
    }

    public String getSeq() {
        return Seq;
    }

    public void setSeq(String seq) {
        Seq = seq;
    }

    public String getIsStop() {
        return IsStop;
    }

    public void setIsStop(String isStop) {
        IsStop = isStop;
    }

    public String getStopDate() {
        return StopDate;
    }

    public void setStopDate(String stopDate) {
        StopDate = stopDate;
    }

    @Override
    public String toString() {
        return "PCANode{" +
                "id=" + id +
                ", ItemNode='" + ItemNode + '\'' +
                ", ItemNodeName='" + ItemNodeName + '\'' +
                ", CarNodePeriod='" + CarNodePeriod + '\'' +
                ", Seq='" + Seq + '\'' +
                ", IsStop='" + IsStop + '\'' +
                ", StopDate='" + StopDate + '\'' +
                ", versionlist=" + versionlist +
                '}';
    }
}
