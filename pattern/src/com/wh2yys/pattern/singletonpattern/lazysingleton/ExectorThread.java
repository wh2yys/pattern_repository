package com.wh2yys.pattern.singletonpattern.lazysingleton;

/**
 * @ClassName ExectorThread
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/21 15:56
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getNewInstance();
        System.out.println(Thread.currentThread().getName()+":  singletonpattern = " + singleton);
    }
}
