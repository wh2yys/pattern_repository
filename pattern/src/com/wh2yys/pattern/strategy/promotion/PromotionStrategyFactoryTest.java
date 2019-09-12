package com.wh2yys.pattern.strategy.promotion;

class PromotionStrategyFactoryTest {
    public static void main(String[] args) {
       String promotionKey="CASHBACK";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}