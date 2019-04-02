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
    //车辆图片04
    private String crPicture4;
    //车辆图片05
    private String crPicture5;
    //补充描述
    private String crDescribe;
    //发布时间
    private String crTime;
    //用户id 外键
    private Integer uId;
    //租用车辆状态，0车辆注销 1车辆正常 默认1
    private Integer crState;
    //租车标题
    private String crName;
    //租车简介
    private String crType;

    public String getCrPicture4() {
        return crPicture4;
    }

    public void setCrPicture4(String crPicture4) {
        this.crPicture4 = crPicture4;
    }

    public String getCrPicture5() {
        return crPicture5;
    }

    public void setCrPicture5(String crPicture5) {
        this.crPicture5 = crPicture5;
    }

    public String getCrType() {
        return crType;
    }

    public void setCrType(String crType) {
        this.crType = crType;
    }

    public String getCrName() {
        return crName;
    }

    public void setCrName(String crName) {
        this.crName = crName;
    }

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
