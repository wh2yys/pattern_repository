package com.wh2yys.pattern.decorator.battercake.v1;

/**
 * @author wh
 * @description
 * @date 2019/9/14
 */
public class BattercakeWithHotdog extends BattercakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg()+"一根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
