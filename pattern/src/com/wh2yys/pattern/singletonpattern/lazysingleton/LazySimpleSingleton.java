package com.wh2yys.pattern.singletonpattern.lazysingleton;

/**
 * @ClassName LazySimpleSingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/21 15:19
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton singleton=null;

    private LazySimpleSingleton() {
    }
    public static LazySimpleSingleton getNewInstance(){
        if (singleton==null){
            singleton=new LazySimpleSingleton();
        }
        return singleton;
    }
}
