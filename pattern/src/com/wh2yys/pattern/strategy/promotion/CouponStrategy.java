package com.wh2yys.pattern.strategy.promotion;

/**
 * @author wh
 * @description
 * @date 2019/9/11
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠卷，直接抵扣");
    }
}
