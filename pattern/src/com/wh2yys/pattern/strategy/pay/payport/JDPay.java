package com.wh2yys.pattern.strategy.pay.payport;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
