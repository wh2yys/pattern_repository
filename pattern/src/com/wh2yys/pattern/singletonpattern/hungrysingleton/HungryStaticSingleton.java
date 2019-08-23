package com.wh2yys.pattern.singletonpattern.hungrysingleton;

/**
 * @ClassName HungryStaticSingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/21 15:03
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton singleton;
    static {
        singleton=new HungryStaticSingleton();
    }
    private HungryStaticSingleton() {
    }
    public static HungryStaticSingleton getNewInstance(){
        return singleton;
    }
}
