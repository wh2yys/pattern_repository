package com.wh2yys.pattern.proxypattern.staticproxy.demo2;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 17:19
 */
public class OrderDao {
    public int insert(Order order) {
        System.out.println("OrderDao 创建order成功！");
        return 1;
    }
}
