package com.wh2yys.pattern.strategy.pay.payport;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }
}
