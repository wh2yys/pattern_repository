package com.wh2yys.pattern.singleton.hungrysingleton.test;

import com.wh2yys.pattern.singleton.hungrysingleton.HungryStaticSingleton;

/**
 * @ClassName TestHungrySingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/21 14:58
 */
public class TestHungryStaticSingleton1 {
    public static void main(String[] args) {
        HungryStaticSingleton singleton1 = HungryStaticSingleton.getNewInstance();
        HungryStaticSingleton singleton2 = HungryStaticSingleton.getNewInstance();
        System.out.println(singleton1==singleton2);
    }
}
