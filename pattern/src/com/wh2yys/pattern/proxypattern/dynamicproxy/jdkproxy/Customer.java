package com.wh2yys.pattern.proxypattern.dynamicproxy.jdkproxy;

import com.wh2yys.pattern.proxypattern.staticproxy.demo1.Person;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/23 14:41
 */
public class Customer implements Person {

    @Override
    public void findLove() {
        System.out.println("消费者提出需求");
    }
}
