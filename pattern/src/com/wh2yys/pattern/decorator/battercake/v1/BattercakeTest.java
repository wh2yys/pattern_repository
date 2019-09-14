package com.wh2yys.pattern.decorator.battercake.v1;

class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg()+"------"+battercake.getPrice());

        battercake= new BattercakeWithEgg();
        System.out.println(battercake.getMsg()+"------"+battercake.getPrice());

        battercake=new BattercakeWithHotdog();
        System.out.println(battercake.getMsg()+"------"+battercake.getPrice());
    }
}