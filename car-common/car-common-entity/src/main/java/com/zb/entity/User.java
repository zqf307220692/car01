package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class User implements Serializable {
    //个人用户信息编号,主键
    private Integer uId;
    //用户名
    private String uloginName;
    //用户密码
    private String uPwd;
    //邮箱地址
    private String uEmail;
    //联系人
    private String uPerson;
    //手机号码
    private String uPhone;
    //头像地址
    private String uPicture;
    //城市
    private String uCity;
    //会员标记,0非会员 1会员  会员可以发布租车
    private Integer uVipSign;
    //车行认证,0.未认证 1.认证  认证通过 可以发布车行信息
    private Integer uIdent;
    //用户状态,0用户注销 1用户正常 默认1
    private Integer uState;
    //get set 方法
    public void setUId (Integer  uId){
        this.uId=uId;
    }
    public  Integer getUId(){
        return this.uId;
    }
    public void setUloginName (String  uloginName){
        this.uloginName=uloginName;
    }
    public  String getUloginName(){
        return this.uloginName;
    }
    public void setUPwd (String  uPwd){
        this.uPwd=uPwd;
    }
    public  String getUPwd(){
        return this.uPwd;
    }
    public void setUEmail (String  uEmail){
        this.uEmail=uEmail;
    }
    public  String getUEmail(){
        return this.uEmail;
    }
    public void setUPerson (String  uPerson){
        this.uPerson=uPerson;
    }
    public  String getUPerson(){
        return this.uPerson;
    }
    public void setUPhone (String  uPhone){
        this.uPhone=uPhone;
    }
    public  String getUPhone(){
        return this.uPhone;
    }
    public void setUPicture (String  uPicture){
        this.uPicture=uPicture;
    }
    public  String getUPicture(){
        return this.uPicture;
    }
    public void setUCity (String  uCity){
        this.uCity=uCity;
    }
    public  String getUCity(){
        return this.uCity;
    }
    public void setUVipSign (Integer  uVipSign){
        this.uVipSign=uVipSign;
    }
    public  Integer getUVipSign(){
        return this.uVipSign;
    }
    public void setUIdent (Integer  uIdent){
        this.uIdent=uIdent;
    }
    public  Integer getUIdent(){
        return this.uIdent;
    }
    public void setUState (Integer  uState){
        this.uState=uState;
    }
    public  Integer getUState(){
        return this.uState;
    }
}
