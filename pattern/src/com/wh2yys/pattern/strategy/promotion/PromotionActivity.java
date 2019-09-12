package com.wh2yys.pattern.strategy.promotion;

/**
 * @author wh
 * @description
 * @date 2019/9/11
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void execute(){
        promotionStrategy.doPromotion();
    }
}
