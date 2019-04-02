package com.zb.service;

import com.zb.entity.Carbuy;

import java.util.List;

public interface RpcCarBuyService {

    //查询所有的二手车信息
    public List<Carbuy> findCarBuy(Integer index,Integer pageSize,Integer mId,Integer tId,String cbMoney,String cbPaiLiang)throws Exception;
    //获取总数量
    public int getCount(Integer mId,Integer tId,String cbMoney,String cbPaiLiang)throws Exception;
    //根据id获取指定的二手车信息
    public Carbuy getCarBuyById(Integer cbId)throws Exception;
}


