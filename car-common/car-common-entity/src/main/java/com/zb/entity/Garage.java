package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Garage implements Serializable {
    //车行编号
    private Integer gId;
    //车行名称
    private String gName;
    //联系人
    private String gPerson;
    //销售代表名称
    private String gSaleName;
    //销售代表图片地址
    private String gSalePicture;
    //销售代表电话
    private String gSalePhone;
    //车行固定电话
    private String gTel;
    //车行手机号码
    private String gPhone;
    //车行地址
    private String gAddress;
    //车行简介
    private String gIntroduce;
    //车行Logo图片
    private String gPicture;
    //用户id 外键
    private Integer gBusinessId;
    //车行状态  0车行注销 1车行正常 默认1
    private Integer gState;
    //get set 方法
    public void setGId (Integer  gId){
        this.gId=gId;
    }
    public  Integer getGId(){
        return this.gId;
    }
    public void setGName (String  gName){
        this.gName=gName;
    }
    public  String getGName(){
        return this.gName;
    }
    public void setGPerson (String  gPerson){
        this.gPerson=gPerson;
    }
    public  String getGPerson(){
        return this.gPerson;
    }
    public void setGSaleName (String  gSaleName){
        this.gSaleName=gSaleName;
    }
    public  String getGSaleName(){
        return this.gSaleName;
    }
    public void setGSalePicture (String  gSalePicture){
        this.gSalePicture=gSalePicture;
    }
    public  String getGSalePicture(){
        return this.gSalePicture;
    }
    public void setGSalePhone (String  gSalePhone){
        this.gSalePhone=gSalePhone;
    }
    public  String getGSalePhone(){
        return this.gSalePhone;
    }
    public void setGTel (String  gTel){
        this.gTel=gTel;
    }
    public  String getGTel(){
        return this.gTel;
    }
    public void setGPhone (String  gPhone){
        this.gPhone=gPhone;
    }
    public  String getGPhone(){
        return this.gPhone;
    }
    public void setGAddress (String  gAddress){
        this.gAddress=gAddress;
    }
    public  String getGAddress(){
        return this.gAddress;
    }
    public void setGIntroduce (String  gIntroduce){
        this.gIntroduce=gIntroduce;
    }
    public  String getGIntroduce(){
        return this.gIntroduce;
    }
    public void setGPicture (String  gPicture){
        this.gPicture=gPicture;
    }
    public  String getGPicture(){
        return this.gPicture;
    }
    public void setGBusinessId (Integer  gBusinessId){
        this.gBusinessId=gBusinessId;
    }
    public  Integer getGBusinessId(){
        return this.gBusinessId;
    }
    public void setGState (Integer  gState){
        this.gState=gState;
    }
    public  Integer getGState(){
        return this.gState;
    }
}
