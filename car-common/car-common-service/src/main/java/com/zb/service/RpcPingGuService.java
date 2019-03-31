package com.zb.service;

import com.zb.entity.Pinggu;

public interface RpcPingGuService {
    //添加评估信息
    public int insertPingGu(Pinggu pinggu)throws Exception;
}
