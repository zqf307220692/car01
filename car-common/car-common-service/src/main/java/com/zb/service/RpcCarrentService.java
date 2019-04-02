package com.zb.service;

import com.zb.entity.Carrent;

import java.util.List;

public interface RpcCarrentService {
    //获取所有租赁车辆信息
    public List<Carrent> getCarrentAll(Integer index,Integer pageSize,Integer mId,Integer tId,String crDateMoney)throws Exception;

    public Integer getCount(Integer mId,Integer tId,String crDateMoney)throws Exception;
    //根据id获取租车信息
    public Carrent getCarrentById(Integer crId)throws Exception;
}
