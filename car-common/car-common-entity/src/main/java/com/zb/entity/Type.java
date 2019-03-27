package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Type implements Serializable {
    //车辆型号编号
    private Integer tId;
    //车辆型号名称
    private String tName;
    //get set 方法
    public void setTId (Integer  tId){
        this.tId=tId;
    }
    public  Integer getTId(){
        return this.tId;
    }
    public void setTName (String  tName){
        this.tName=tName;
    }
    public  String getTName(){
        return this.tName;
    }
}
