package com.example.project_basic_manager.ProjectNodeManager.General;

/**
 * 				ItemNode: '',
 * 				ItemNodeName: '',
 * 				CarNodePeriod: '',
 * 				IsStop: '',
 * 				StopDate: ''
 */

public class RecPCANode {
    private String itemNode;
    private String itemNodeName;
    private String carNodePeriod;
    private String isStop;
    private String stopDate;

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

    public RecPCANode(){

    }

    public RecPCANode(String itemNode, String itemNodeName, String carNodePeriod, String isStop, String stopDate) {
        this.itemNode = itemNode;
        this.itemNodeName = itemNodeName;
        this.carNodePeriod = carNodePeriod;
        this.isStop = isStop;
        this.stopDate = stopDate;
    }

    @Override
    public String toString() {
        return "RecPCANode{" +
                "ItemNode='" + itemNode + '\'' +
                ", ItemNodeName='" + itemNodeName + '\'' +
                ", CarNodePeriod='" + carNodePeriod + '\'' +
                ", IsStop='" + isStop + '\'' +
                ", StopDate='" + stopDate + '\'' +
                '}';
    }
}
