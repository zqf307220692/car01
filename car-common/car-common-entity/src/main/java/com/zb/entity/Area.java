package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Area implements Serializable {
    //市编号
    private Integer aId;
    //市名称
    private String aCity;
    //get set 方法
    public void setAId (Integer  aId){
        this.aId=aId;
    }
    public  Integer getAId(){
        return this.aId;
    }
    public void setACity (String  aCity){
        this.aCity=aCity;
    }
    public  String getACity(){
        return this.aCity;
    }
}
