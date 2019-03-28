package com.zb.service;


import com.zb.entity.User;

public interface RpcCarUserService {


    public User getUserLogin(String uloginName, String uPwd) throws Exception;

    /**
     * 根据token 返回当前用户对象
     * @param token
     * @return
     * @throws Exception
     */
    public User getCurrUser(String token) throws Exception;


}
