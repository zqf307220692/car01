package com.zb.service;

import com.zb.entity.Carbuy;

import java.util.List;

public interface RpcCarBuyService {

    //查询所有的二手车信息
    public List<Carbuy> findCarBuy(Integer mId,Integer tId,String cbMoney,String cbPaiLiang)throws Exception;

    public int getCount(Integer mId,Integer tId,String cbMoney,String cbPaiLiang)throws Exception;
}


