package com.wh2yys.pattern.singleton.lazysingleton;

/**
 * @ClassName ExectorThread
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/21 15:56
 */
public class ExectorThread1 implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getNewInstances();
        System.out.println(Thread.currentThread().getName()+":  singleton = " + singleton);
    }

}
