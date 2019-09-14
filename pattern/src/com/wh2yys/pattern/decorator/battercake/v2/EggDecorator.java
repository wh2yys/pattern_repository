package com.wh2yys.pattern.decorator.battercake.v2;

/**
 * @author wh
 * @description
 * @date 2019/9/14
 */
public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"  一个鸡蛋   ";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
