package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Question implements Serializable {
    //二手车问答编号
    private Integer quId;
    //二手车问答问题
    private String quQuestion;
    //二手车问答回答
    private String quAnswer;
    //二手车问答发布时间
    private String quCreateTime;
    //get set 方法
    public void setQuId (Integer  quId){
        this.quId=quId;
    }
    public  Integer getQuId(){
        return this.quId;
    }
    public void setQuQuestion (String  quQuestion){
        this.quQuestion=quQuestion;
    }
    public  String getQuQuestion(){
        return this.quQuestion;
    }
    public void setQuAnswer (String  quAnswer){
        this.quAnswer=quAnswer;
    }
    public  String getQuAnswer(){
        return this.quAnswer;
    }
    public void setQuCreateTime (String  quCreateTime){
        this.quCreateTime=quCreateTime;
    }
    public  String getQuCreateTime(){
        return this.quCreateTime;
    }
}
