package com.example.repomanager.common;

import java.util.Date;
import java.util.List;

public class recrole{

    private String rId;							//主键
    private String rName;						//角色名称
    private String rDetail;						//角色描述


    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrDetail() {
        return rDetail;
    }

    public void setrDetail(String rDetail) {
        this.rDetail = rDetail;
    }

}