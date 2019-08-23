package com.wh2yys.pattern.singletonpattern.lazysingleton;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/21 16:35
 */
public class LazyDoubleCheckSingleton {
    private volatile static  LazyDoubleCheckSingleton singleton=null;

    public LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getNewInstances(){
        if (singleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (singleton==null){
                    singleton=new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
