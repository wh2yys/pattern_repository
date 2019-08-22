package com.wh2yys.pattern.singleton.threadlocalsingleton;

/**
 * @ClassName ThreadLocalSingletonTest
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 15:03
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
