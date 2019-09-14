package com.wh2yys.pattern.decorator.battercake.v2;

/**
 * @author wh
 * @description
 * @date 2019/9/14
 */
public class HotdogDecorator extends BattercakeDecorator {
    public HotdogDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"  一个香肠   ";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
