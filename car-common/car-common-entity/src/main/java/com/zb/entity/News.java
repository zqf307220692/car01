package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class News implements Serializable {
    //网站动态编号
    private Integer nsId;
    //网站动态标题
    private String nsTitle;
    //网站动态副标题
    private String nsSubTitle;
    //网站动态内容
    private String nsContent;
    //网站动态图片
    private String nsPic;
    //网站动态发布时间
    private String nsCreateTime;
    //get set 方法
    public void setNsId (Integer  nsId){
        this.nsId=nsId;
    }
    public  Integer getNsId(){
        return this.nsId;
    }
    public void setNsTitle (String  nsTitle){
        this.nsTitle=nsTitle;
    }
    public  String getNsTitle(){
        return this.nsTitle;
    }
    public void setNsSubTitle (String  nsSubTitle){
        this.nsSubTitle=nsSubTitle;
    }
    public  String getNsSubTitle(){
        return this.nsSubTitle;
    }
    public void setNsContent (String  nsContent){
        this.nsContent=nsContent;
    }
    public  String getNsContent(){
        return this.nsContent;
    }
    public void setNsPic (String  nsPic){
        this.nsPic=nsPic;
    }
    public  String getNsPic(){
        return this.nsPic;
    }
    public void setNsCreateTime (String  nsCreateTime){
        this.nsCreateTime=nsCreateTime;
    }
    public  String getNsCreateTime(){
        return this.nsCreateTime;
    }
}
