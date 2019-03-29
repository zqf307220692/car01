package com.zb.service;

import com.zb.entity.Manager;

public interface RpcCarManagerTokenService {
    //生成token
    public String gengerateToken(String userAgentString, Manager manager);

    //保存token
    public void saveToken(String token,Manager manager);
}
