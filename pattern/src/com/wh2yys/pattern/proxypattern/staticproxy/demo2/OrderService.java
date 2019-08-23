package com.wh2yys.pattern.proxypattern.staticproxy.demo2;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 17:24
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService() {
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
