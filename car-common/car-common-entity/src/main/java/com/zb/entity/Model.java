package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Model implements Serializable {
    //车辆系列编号
    private Integer moId;
    //车辆系列品牌
    private String moBrand;
    //车辆系列名称
    private String moName;
    //get set 方法
    public void setMoId (Integer  moId){
        this.moId=moId;
    }
    public  Integer getMoId(){
        return this.moId;
    }
    public void setMoBrand (String  moBrand){
        this.moBrand=moBrand;
    }
    public  String getMoBrand(){
        return this.moBrand;
    }
    public void setMoName (String  moName){
        this.moName=moName;
    }
    public  String getMoName(){
        return this.moName;
    }
}
