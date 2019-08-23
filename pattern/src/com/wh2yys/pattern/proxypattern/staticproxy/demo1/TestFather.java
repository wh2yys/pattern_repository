package com.wh2yys.pattern.proxypattern.staticproxy.demo1;

/**
 * @ClassName TestFather
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 17:15
 */
public class TestFather {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
