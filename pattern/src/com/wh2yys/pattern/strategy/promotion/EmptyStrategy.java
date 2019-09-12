package com.wh2yys.pattern.strategy.promotion;

/**
 * @author wh
 * @description
 * @date 2019/9/11
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("没有促销活动");
    }
}
