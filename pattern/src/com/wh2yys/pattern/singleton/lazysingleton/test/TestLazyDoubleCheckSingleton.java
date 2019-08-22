package com.wh2yys.pattern.singleton.lazysingleton.test;

import com.wh2yys.pattern.singleton.lazysingleton.ExectorThread1;

/**
 * @ClassName TestLazyDoubleCheckSingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 9:29
 */
public class TestLazyDoubleCheckSingleton {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread1());
        Thread thread2 = new Thread(new ExectorThread1());
        thread1.start();
        thread2.start();
        System.out.println("End");

    }
}
