package com.wh2yys.pattern.proxypattern.dynamicproxy.jdkproxy;

import com.wh2yys.pattern.proxypattern.staticproxy.demo1.Person;

/**
 * @ClassName JdkProxyTest
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/23 14:42
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        Person obj = (Person) new JDKMeipo().getInstance(new Customer());
        obj.findLove();
    }
}
