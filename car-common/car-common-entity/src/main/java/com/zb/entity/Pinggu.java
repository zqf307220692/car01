package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Pinggu implements Serializable {
    //评估车源编号
    private Integer pgId;
    //品牌车系编号,外键
    private Integer mId;
    //车型编号，外键
    private Integer tId;
    //上牌日期
    private String pgDate;
    //行驶里程
    private String pgLicheng;
    //手机
    private String pgPhone;
    //发布时间
    private String pgTime;
    //评估后价格
    private Double pgPrice;
    //get set 方法
    public void setPgId (Integer  pgId){
        this.pgId=pgId;
    }
    public  Integer getPgId(){
        return this.pgId;
    }
    public void setMId (Integer  mId){
        this.mId=mId;
    }
    public  Integer getMId(){
        return this.mId;
    }
    public void setTId (Integer  tId){
        this.tId=tId;
    }
    public  Integer getTId(){
        return this.tId;
    }
    public void setPgDate (String  pgDate){
        this.pgDate=pgDate;
    }
    public  String getPgDate(){
        return this.pgDate;
    }
    public void setPgLicheng (String  pgLicheng){
        this.pgLicheng=pgLicheng;
    }
    public  String getPgLicheng(){
        return this.pgLicheng;
    }
    public void setPgPhone (String  pgPhone){
        this.pgPhone=pgPhone;
    }
    public  String getPgPhone(){
        return this.pgPhone;
    }
    public void setPgTime (String  pgTime){
        this.pgTime=pgTime;
    }
    public  String getPgTime(){
        return this.pgTime;
    }
    public void setPgPrice (Double  pgPrice){
        this.pgPrice=pgPrice;
    }
    public  Double getPgPrice(){
        return this.pgPrice;
    }
}
