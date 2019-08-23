package com.wh2yys.pattern.singletonpattern.hungrysingleton.test;

import com.wh2yys.pattern.singletonpattern.hungrysingleton.HungrySingleton;

/**
 * @ClassName TestHungrySingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/21 14:58
 */
public class TestHungrySingleton {
    public static void main(String[] args) {
        HungrySingleton singleton1 = HungrySingleton.getNewInsatace();
        HungrySingleton singleton2 = HungrySingleton.getNewInsatace();
        System.out.println(singleton1==singleton2);
    }
}
