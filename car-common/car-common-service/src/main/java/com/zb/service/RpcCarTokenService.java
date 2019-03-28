package com.zb.service;


import com.zb.entity.User;

public interface RpcCarTokenService {

    //生成token111
    public String gengeratToken(String userAgentString, User user);

    //保存token
    public void saveToken(String token,User user);

}
