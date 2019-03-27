package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Carrent implements Serializable {
    //租用车辆编号
    private Integer crId;
    //城市编号,外键
    private Integer aId;
    //品牌车系编号，外键
    private Integer mId;
    //车型编号，外键
    private Integer tId;
    //日租金
    private String crDateMoney;
    //月租金
    private String crMonMoney;
    //车辆图片01
    private String crPicture1;
    //车辆图片02
    private String crPicture2;
    //车辆图片03
    private String crPicture3;
    //补充描述
    private String crDescribe;
    //发布时间
    private String crTime;
    //用户id 外键
    private Integer uId;
    //租用车辆状态，0车辆注销 1车辆正常 默认1
    private Integer crState;
    //get set 方法
    public void setCrId (Integer  crId){
        this.crId=crId;
    }
    public  Integer getCrId(){
        return this.crId;
    }
    public void setAId (Integer  aId){
        this.aId=aId;
    }
    public  Integer getAId(){
        return this.aId;
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
    public void setCrDateMoney (String  crDateMoney){
        this.crDateMoney=crDateMoney;
    }
    public  String getCrDateMoney(){
        return this.crDateMoney;
    }
    public void setCrMonMoney (String  crMonMoney){
        this.crMonMoney=crMonMoney;
    }
    public  String getCrMonMoney(){
        return this.crMonMoney;
    }
    public void setCrPicture1 (String  crPicture1){
        this.crPicture1=crPicture1;
    }
    public  String getCrPicture1(){
        return this.crPicture1;
    }
    public void setCrPicture2 (String  crPicture2){
        this.crPicture2=crPicture2;
    }
    public  String getCrPicture2(){
        return this.crPicture2;
    }
    public void setCrPicture3 (String  crPicture3){
        this.crPicture3=crPicture3;
    }
    public  String getCrPicture3(){
        return this.crPicture3;
    }
    public void setCrDescribe (String  crDescribe){
        this.crDescribe=crDescribe;
    }
    public  String getCrDescribe(){
        return this.crDescribe;
    }
    public void setCrTime (String  crTime){
        this.crTime=crTime;
    }
    public  String getCrTime(){
        return this.crTime;
    }
    public void setUId (Integer  uId){
        this.uId=uId;
    }
    public  Integer getUId(){
        return this.uId;
    }
    public void setCrState (Integer  crState){
        this.crState=crState;
    }
    public  Integer getCrState(){
        return this.crState;
    }
}
