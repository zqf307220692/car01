package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Vip implements Serializable {
    //会员编号,主键，主键，自增,非空
    private Integer vId;
    //用户编号,外键非空
    private Integer uId;
    //充值时间
    private String vStart;
    //到期时间
    private String vEnd;
    //get set 方法
    public void setVId (Integer  vId){
        this.vId=vId;
    }
    public  Integer getVId(){
        return this.vId;
    }
    public void setUId (Integer  uId){
        this.uId=uId;
    }
    public  Integer getUId(){
        return this.uId;
    }
    public void setVStart (String  vStart){
        this.vStart=vStart;
    }
    public  String getVStart(){
        return this.vStart;
    }
    public void setVEnd (String  vEnd){
        this.vEnd=vEnd;
    }
    public  String getVEnd(){
        return this.vEnd;
    }
}
