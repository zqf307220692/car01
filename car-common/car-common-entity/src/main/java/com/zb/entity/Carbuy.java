package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Carbuy implements Serializable {
    //二手车买卖编号
    private Integer cbId;
    //城市编号，外键
    private Integer aId;
    //品牌和车系编号，外键
    private Integer mId;
    //车型编号，外键
    private Integer tId;
    //预售价格
    private Double cbMoney;
    //出厂报价
    private Double cbOfferMoney;
    //购置税
    private Double cbPurchasetax;
    //为您节省
    private Double cbJieSheng;
    //车体颜色
    private String cbColor;
    //排量
    private String cbPaiLiang;
    //变速箱
    private String cbBianSu;
    //上牌时间
    private String cbDate;
    //行驶里程
    private String cbLiCheng;
    //国产进口
    private String cbNeiAndWai;
    //排放标准
    private String cbBiaozhun;
    //交强险到期时间
    private String cbCompulsoryTime;
    //年检有效期
    private String cbValidity;
    //车辆图片1
    private String cbPicture1;
    //车辆图片2
    private String cbPicture2;
    //车辆图片3
    private String cbPicture3;
    //车辆图片4
    private String cbPicture4;
    //车辆描述
    private String cbDescribe;
    //热门车辆（0为普通，1为热门）
    private Integer cbPopular;
    //发布时间(默认使用当前系统时间)
    private String cbTime;
    //推荐车源（0为不推荐，1位推荐）
    private Integer cbRecommend;
    //用户id，外键
    private Integer uId;
    //二手车车辆状态（0车辆注销 1车辆正常 默认1）
    private Integer cbState;
    //get set 方法
    public void setCbId (Integer  cbId){
        this.cbId=cbId;
    }
    public  Integer getCbId(){
        return this.cbId;
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
    public void setCbMoney (Double  cbMoney){
        this.cbMoney=cbMoney;
    }
    public  Double getCbMoney(){
        return this.cbMoney;
    }
    public void setCbOfferMoney (Double  cbOfferMoney){
        this.cbOfferMoney=cbOfferMoney;
    }
    public  Double getCbOfferMoney(){
        return this.cbOfferMoney;
    }
    public void setCbPurchasetax (Double  cbPurchasetax){
        this.cbPurchasetax=cbPurchasetax;
    }
    public  Double getCbPurchasetax(){
        return this.cbPurchasetax;
    }
    public void setCbJieSheng (Double  cbJieSheng){
        this.cbJieSheng=cbJieSheng;
    }
    public  Double getCbJieSheng(){
        return this.cbJieSheng;
    }
    public void setCbColor (String  cbColor){
        this.cbColor=cbColor;
    }
    public  String getCbColor(){
        return this.cbColor;
    }
    public void setCbPaiLiang (String  cbPaiLiang){
        this.cbPaiLiang=cbPaiLiang;
    }
    public  String getCbPaiLiang(){
        return this.cbPaiLiang;
    }
    public void setCbBianSu (String  cbBianSu){
        this.cbBianSu=cbBianSu;
    }
    public  String getCbBianSu(){
        return this.cbBianSu;
    }
    public void setCbDate (String  cbDate){
        this.cbDate=cbDate;
    }
    public  String getCbDate(){
        return this.cbDate;
    }
    public void setCbLiCheng (String  cbLiCheng){
        this.cbLiCheng=cbLiCheng;
    }
    public  String getCbLiCheng(){
        return this.cbLiCheng;
    }
    public void setCbNeiAndWai (String  cbNeiAndWai){
        this.cbNeiAndWai=cbNeiAndWai;
    }
    public  String getCbNeiAndWai(){
        return this.cbNeiAndWai;
    }
    public void setCbBiaozhun (String  cbBiaozhun){
        this.cbBiaozhun=cbBiaozhun;
    }
    public  String getCbBiaozhun(){
        return this.cbBiaozhun;
    }
    public void setCbCompulsoryTime (String  cbCompulsoryTime){
        this.cbCompulsoryTime=cbCompulsoryTime;
    }
    public  String getCbCompulsoryTime(){
        return this.cbCompulsoryTime;
    }
    public void setCbValidity (String  cbValidity){
        this.cbValidity=cbValidity;
    }
    public  String getCbValidity(){
        return this.cbValidity;
    }
    public void setCbPicture1 (String  cbPicture1){
        this.cbPicture1=cbPicture1;
    }
    public  String getCbPicture1(){
        return this.cbPicture1;
    }
    public void setCbPicture2 (String  cbPicture2){
        this.cbPicture2=cbPicture2;
    }
    public  String getCbPicture2(){
        return this.cbPicture2;
    }
    public void setCbPicture3 (String  cbPicture3){
        this.cbPicture3=cbPicture3;
    }
    public  String getCbPicture3(){
        return this.cbPicture3;
    }
    public void setCbPicture4 (String  cbPicture4){
        this.cbPicture4=cbPicture4;
    }
    public  String getCbPicture4(){
        return this.cbPicture4;
    }
    public void setCbDescribe (String  cbDescribe){
        this.cbDescribe=cbDescribe;
    }
    public  String getCbDescribe(){
        return this.cbDescribe;
    }
    public void setCbPopular (Integer  cbPopular){
        this.cbPopular=cbPopular;
    }
    public  Integer getCbPopular(){
        return this.cbPopular;
    }
    public void setCbTime (String  cbTime){
        this.cbTime=cbTime;
    }
    public  String getCbTime(){
        return this.cbTime;
    }
    public void setCbRecommend (Integer  cbRecommend){
        this.cbRecommend=cbRecommend;
    }
    public  Integer getCbRecommend(){
        return this.cbRecommend;
    }
    public void setUId (Integer  uId){
        this.uId=uId;
    }
    public  Integer getUId(){
        return this.uId;
    }
    public void setCbState (Integer  cbState){
        this.cbState=cbState;
    }
    public  Integer getCbState(){
        return this.cbState;
    }
}
