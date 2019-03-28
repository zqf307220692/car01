package com.zb.service;


import com.zb.entity.User;

public interface RpcCarTokenService {

    public String gengeratToken(String userAgentString, User user);


    public void saveToken(String token,User user);

}
