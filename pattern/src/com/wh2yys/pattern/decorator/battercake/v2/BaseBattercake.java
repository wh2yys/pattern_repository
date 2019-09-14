package com.wh2yys.pattern.decorator.battercake.v2;

/**
 * @author wh
 * @description
 * @date 2019/9/14
 */
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
