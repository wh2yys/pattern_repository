package com.wh2yys.pattern.decorator.battercake.v2;

class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake=null;
        battercake=new BaseBattercake();
        System.out.println(battercake.getMsg()+"----"+battercake.getPrice());
        battercake=new EggDecorator(battercake);
        System.out.println(battercake.getMsg()+"----"+battercake.getPrice());
        battercake=new EggDecorator(battercake);
        System.out.println(battercake.getMsg()+"----"+battercake.getPrice());
        battercake=new HotdogDecorator(battercake);
        System.out.println(battercake.getMsg()+"----"+battercake.getPrice());

    }
}