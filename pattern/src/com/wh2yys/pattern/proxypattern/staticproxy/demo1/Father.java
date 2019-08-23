package com.wh2yys.pattern.proxypattern.staticproxy.demo1;

/**
 * @ClassName Father
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 17:11
 */
public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove(){
        System.out.println("父亲开始为儿子物色对象");
        this.son.findLove();
        System.out.println("同意  见面");
    }
}
