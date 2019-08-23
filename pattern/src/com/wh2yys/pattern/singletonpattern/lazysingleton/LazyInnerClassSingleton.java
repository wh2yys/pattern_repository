package com.wh2yys.pattern.singletonpattern.lazysingleton;

/**
 * @ClassName LazyInnerClassSingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 9:49
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getNewInstances(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY =new LazyInnerClassSingleton();
    }
}
