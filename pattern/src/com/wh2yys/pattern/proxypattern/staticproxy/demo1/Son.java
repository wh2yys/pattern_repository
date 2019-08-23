package com.wh2yys.pattern.proxypattern.staticproxy.demo1;

/**
 * @ClassName Son
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 17:10
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("提出需求");
    }
}
