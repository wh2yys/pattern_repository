package com.wh2yys.pattern.adapter.loginadapter;

/**
 * @author wh
 * @description
 * @date 2019/9/13
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String  id,Object adapter);
}
