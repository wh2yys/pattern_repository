package com.wh2yys.pattern.adapter.loginadapter;

/**
 * @author wh
 * @description
 * @date 2019/9/13
 */
public interface IPassportForThird {
    ResultMsg loginForQQ(String id);
    ResultMsg loginForSina(String id);
    ResultMsg loginForTel(String telphone,String code);
    ResultMsg loginForWeChat(String id);
    ResultMsg loginForToken(String token);
    ResultMsg loginForRegist(String username,String passport);


}
