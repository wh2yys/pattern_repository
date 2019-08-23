package com.wh2yys.pattern.singletonpattern.lazysingleton.test;

import com.wh2yys.pattern.singletonpattern.lazysingleton.EnumSingleton;

import java.io.*;

/**
 * @ClassName EnumSingletonTest
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 14:29
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance1=null;

        EnumSingleton instance = EnumSingleton.getInstance();

        instance.setData(new Object());

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EnumSingleton.obj"));
            oos.writeObject(instance);
            oos.flush();
            oos.close();


            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("EnumSingleton.obj"));
            instance1= (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(instance.getDate());
            System.out.println(instance1.getDate());
            System.out.println(instance.getDate()==instance1.getDate());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
