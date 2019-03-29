package com.zb.service;

import com.zb.entity.Manager;

public interface RpcCarManagerService {
    //登录11
    public Manager getManagerLogin(String mName, String mPwd) throws Exception;

    //根据token 返回当前管理员对象
    public Manager getCurrManager(String token) throws Exception;
}
