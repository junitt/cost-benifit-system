package com.example.project_basic_manager.ProjectNodeManager.General;

import lombok.Data;

@Data
public class Result {
    public int code;
    public String msg;
    public long total;
    public Object date;
    public Result(int code, String msg){
        this.code=code;
        this.msg=msg;
    }
    public Result(int code, String msg, long total, Object data){
        this.code=code;
        this.msg=msg;
        this.total=total;
        this.date=data;
    }
}
