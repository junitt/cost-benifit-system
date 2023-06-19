package com.example.repomanager.entity;


import lombok.Data;

@Data
public class result {
    public int code;
    public String msg;
    public long total;
    public Object date;
    public result(int code, String msg){
        this.code=code;
        this.msg=msg;
    }
    public result(int code, String msg,long total,Object data){
        this.code=code;
        this.msg=msg;
        this.total=total;
        this.date=data;
    }
}
