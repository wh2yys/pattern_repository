package com.wh2yys.pattern.adapter.loginadapter;

/**
 * @author wh
 * @description
 * @date 2019/9/13
 */
public class SiginService {
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",null);
    }
    public ResultMsg login(String username,String password){
        return null;
    }
}
