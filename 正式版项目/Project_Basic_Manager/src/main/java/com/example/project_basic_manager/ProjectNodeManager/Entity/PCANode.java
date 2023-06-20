package com.example.project_basic_manager.ProjectNodeManager.Entity;

import com.example.project_basic_manager.ProjectNodeManager.General.RecPCANode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class PCANode {

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

    public PCANode() {

    }

    public PCANode(RecPCANode recPCANode) {
        this.ItemNode = recPCANode.getItemNode();
        this.ItemNodeName = recPCANode.getItemNodeName();
        this.CarNodePeriod = recPCANode.getCarNodePeriod();
        this.IsStop = recPCANode.getIsStop();
        this.StopDate = recPCANode.getStopDate();
    }

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

    public void SetAttribute(PCANode other) {
        this.ItemNode = other.getItemNode();
        this.ItemNodeName = other.getItemNodeName();
        this.CarNodePeriod = other.getCarNodePeriod();
        this.IsStop = other.getIsStop();
        this.StopDate = other.getStopDate();
    }
}
