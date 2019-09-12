package com.wh2yys.pattern.strategy.pay.payport;

import com.wh2yys.pattern.strategy.pay.Order;

class PayStrategyTest {
    public static void main(String[] args) {
        Order order=new Order("1","2018033324234234",324.45);
        System.out.println(order.pay(PayStrategy.UNION_PAY));
    }
}