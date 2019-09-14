package com.wh2yys.pattern.adapter.loginadapter;

/**
 * @author wh
 * @description
 * @date 2019/9/13
 */
public class PassportForThidrAdapter extends SiginService implements IPassportForThird {

    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){

        LoginAdapter adapter = null;
        try {
            adapter = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (adapter.support(adapter)){
            return adapter.login(key,adapter);
        }else {
            return null;
        }
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForSina(String id) {
        return processLogin(id,LoginForSinaAdapter.class);
    }

    @Override
    public ResultMsg loginForTel(String telphone, String code) {
        return processLogin(telphone,LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForWeChat(String id) {
        return processLogin(id,LoginForWeChatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,null);
        return super.login(username,null);
    }
}
