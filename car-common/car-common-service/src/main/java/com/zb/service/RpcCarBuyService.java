package com.zb.service;

import com.zb.entity.Carbuy;

import java.util.List;

public interface RpcCarBuyService {

    //查询所有的
    public List<Carbuy> findCarBuy(Integer mId,Integer tId,String cbMoney,String cbPaiLiang);
}
