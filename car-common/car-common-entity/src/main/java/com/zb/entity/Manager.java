package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Manager implements Serializable {
    //管理员编号,主键
    private Integer mId;
    //管理员用户名
    private String mName;
    //管理员密码
    private String mPwd;
    //邮箱
    private String mEmail;
    //管理员头像
    private String mPicture;
    //get set 方法
    public void setMId (Integer  mId){
        this.mId=mId;
    }
    public  Integer getMId(){
        return this.mId;
    }
    public void setMName (String  mName){
        this.mName=mName;
    }
    public  String getMName(){
        return this.mName;
    }
    public void setMPwd (String  mPwd){
        this.mPwd=mPwd;
    }
    public  String getMPwd(){
        return this.mPwd;
    }
    public void setMEmail (String  mEmail){
        this.mEmail=mEmail;
    }
    public  String getMEmail(){
        return this.mEmail;
    }
    public void setMPicture (String  mPicture){
        this.mPicture=mPicture;
    }
    public  String getMPicture(){
        return this.mPicture;
    }
}
