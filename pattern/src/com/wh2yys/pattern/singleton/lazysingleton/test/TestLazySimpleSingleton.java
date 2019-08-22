package com.wh2yys.pattern.singleton.lazysingleton.test;

import com.wh2yys.pattern.singleton.lazysingleton.ExectorThread;
import com.wh2yys.pattern.singleton.lazysingleton.LazySimpleSingleton;

/**
 * @ClassName TestLazySimpleSingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/21 15:48
 */
public class TestLazySimpleSingleton {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("End");

    }
}
