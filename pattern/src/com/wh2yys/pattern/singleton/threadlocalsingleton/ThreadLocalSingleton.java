package com.wh2yys.pattern.singleton.threadlocalsingleton;

/**
 * @ClassName ThreadLocalSingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 14:57
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadlocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {
    }
    public static ThreadLocalSingleton getInstance(){
        return threadlocalInstance.get();
    }
}
