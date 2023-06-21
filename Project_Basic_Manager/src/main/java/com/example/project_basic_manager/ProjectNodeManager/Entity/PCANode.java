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

    private String itemNode;
    private String itemNodeName;
    private String carNodePeriod;
    private String seq;
    private String isStop;
    private String stopDate;

    @JsonIgnoreProperties(value = {"item", "node","memo"})
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "node")
    List<PCAItemVersion> versionlist;

    public PCANode() {

    }

    public PCANode(RecPCANode recPCANode) {
        this.itemNode = recPCANode.getItemNode();
        this.itemNodeName = recPCANode.getItemNodeName();
        this.carNodePeriod = recPCANode.getCarNodePeriod();
        this.isStop = recPCANode.getIsStop();
        this.stopDate = recPCANode.getStopDate();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemNode() {
        return itemNode;
    }

    public void setItemNode(String itemNode) {
        this.itemNode = itemNode;
    }

    public String getItemNodeName() {
        return itemNodeName;
    }

    public void setItemNodeName(String itemNodeName) {
        this.itemNodeName = itemNodeName;
    }

    public String getCarNodePeriod() {
        return carNodePeriod;
    }

    public void setCarNodePeriod(String carNodePeriod) {
        this.carNodePeriod = carNodePeriod;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getIsStop() {
        return isStop;
    }

    public void setIsStop(String isStop) {
        this.isStop = isStop;
    }

    public String getStopDate() {
        return stopDate;
    }

    public void setStopDate(String stopDate) {
        this.stopDate = stopDate;
    }

    @Override
    public String toString() {
        return "PCANode{" +
                "id=" + id +
                ", ItemNode='" + itemNode + '\'' +
                ", ItemNodeName='" + itemNodeName + '\'' +
                ", CarNodePeriod='" + carNodePeriod + '\'' +
                ", Seq='" + seq + '\'' +
                ", IsStop='" + isStop + '\'' +
                ", StopDate='" + stopDate + '\'' +
                ", versionlist=" + versionlist +
                '}';
    }

    public void SetAttribute(PCANode other) {
        this.itemNode = other.getItemNode();
        this.itemNodeName = other.getItemNodeName();
        this.carNodePeriod = other.getCarNodePeriod();
        this.isStop = other.getIsStop();
        this.stopDate = other.getStopDate();
    }
}
