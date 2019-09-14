package com.wh2yys.pattern.adapter.loginadapter;

/**
 * @author wh
 * @description
 * @date 2019/9/13
 */
public class SigninForThirdService extends SiginService {
    public ResultMsg loginForQQ(String openId){
        return loginForRegist(openId,null);
    }

    private ResultMsg loginForRegist(String username, String password) {
        super.regist(username, null);
        return super.regist(username,null);
    }

    public ResultMsg loginFotWeChat(String openId){
        return null;
    }
    public ResultMsg loginForToken(String token){
        return null;
    }
}
