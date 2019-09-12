package com.wh2yys.pattern.strategy.promotion;

class PromotionActivityTest {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new CashbackStrategy());
        promotionActivity618.execute();
        promotionActivity1111.execute();
    }
}