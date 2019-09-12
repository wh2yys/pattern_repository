package com.wh2yys.pattern.strategy.promotion;

/**
 * @author wh
 * @description
 * @date 2019/9/11
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额转账到支付宝账号");
    }
}
