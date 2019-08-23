package com.wh2yys.pattern.singletonpattern.lazysingleton.test;

import com.wh2yys.pattern.singletonpattern.lazysingleton.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName LazyInnerClassSingletonTest
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 10:04
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;

        try {
            Constructor<LazyInnerClassSingleton> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            LazyInnerClassSingleton singleton1 = constructor.newInstance();

            LazyInnerClassSingleton singleton2 = constructor.newInstance();

            System.out.println(singleton1==singleton2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
