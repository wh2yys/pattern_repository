package com.wh2yys.pattern.proxypattern.staticproxy.demo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName OrderServiceStaticProxy
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/23 9:22
 */
public class OrderServiceStaticProxy implements IOrderService {
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy");
    private OrderService orderService;

    public OrderServiceStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(fmt.format(LocalDate.now()));
        System.out.println("静态代理类自动分配到 DB_" + dbRouter + "数据源处理器");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 1;
    }

    private void after() {
        System.out.println("Proxy before method");
    }

    private void before() {
        System.out.println("Proxy after method");
    }

}
