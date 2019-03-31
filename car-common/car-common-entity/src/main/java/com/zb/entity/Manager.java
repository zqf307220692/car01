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
    //管理员手机
    private String mPhone;
    //权限
    private Integer mQuanXian;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPwd() {
        return mPwd;
    }

    public void setmPwd(String mPwd) {
        this.mPwd = mPwd;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public Integer getmQuanXian() {
        return mQuanXian;
    }

    public void setmQuanXian(Integer mQuanXian) {
        this.mQuanXian = mQuanXian;
    }
}
