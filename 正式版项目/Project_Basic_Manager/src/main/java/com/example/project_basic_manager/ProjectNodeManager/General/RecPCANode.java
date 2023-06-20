package com.example.project_basic_manager.ProjectNodeManager.General;

/**
 * 				ItemNode: '',
 * 				ItemNodeName: '',
 * 				CarNodePeriod: '',
 * 				IsStop: '',
 * 				StopDate: ''
 */

public class RecPCANode {
    private String ItemNode;
    private String ItemNodeName;
    private String CarNodePeriod;
    private String IsStop;
    private String StopDate;

    public String getItemNode() {
        return ItemNode;
    }

    public void setItemNode(String itemNode) {
        this.ItemNode = itemNode;
    }

    public String getItemNodeName() {
        return ItemNodeName;
    }

    public void setItemNodeName(String itemNodeName) {
        this.ItemNodeName = itemNodeName;
    }

    public String getCarNodePeriod() {
        return CarNodePeriod;
    }

    public void setCarNodePeriod(String carNodePeriod) {
        this.CarNodePeriod = carNodePeriod;
    }

    public String getIsStop() {
        return IsStop;
    }

    public void setIsStop(String isStop) {
        this.IsStop = isStop;
    }

    public String getStopDate() {
        return StopDate;
    }

    public void setStopDate(String stopDate) {
        this.StopDate = stopDate;
    }

    public RecPCANode(){

    }

    public RecPCANode(String itemNode, String itemNodeName, String carNodePeriod, String isStop, String stopDate) {
        this.ItemNode = itemNode;
        this.ItemNodeName = itemNodeName;
        this.CarNodePeriod = carNodePeriod;
        this.IsStop = isStop;
        this.StopDate = stopDate;
    }

    @Override
    public String toString() {
        return "RecPCANode{" +
                "ItemNode='" + ItemNode + '\'' +
                ", ItemNodeName='" + ItemNodeName + '\'' +
                ", CarNodePeriod='" + CarNodePeriod + '\'' +
                ", IsStop='" + IsStop + '\'' +
                ", StopDate='" + StopDate + '\'' +
                '}';
    }
}
