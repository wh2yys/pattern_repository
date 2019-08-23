package com.wh2yys.pattern.proxypattern.staticproxy.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DynamicProxyTest
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/23 10:50
 */
public class DynamicProxyTest {
    public static void main(String[] args) throws ParseException {
        Order order = new Order();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date date = format.parse("2017/02/01");
        order.setCreateTime(date.getTime());
        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        orderService.createOrder(order);
    }
}
