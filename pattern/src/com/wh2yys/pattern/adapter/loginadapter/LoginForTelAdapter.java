package com.wh2yys.pattern.adapter.loginadapter;

/**
 * @author wh
 * @description
 * @date 2019/9/13
 */
public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
