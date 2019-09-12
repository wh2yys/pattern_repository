package com.wh2yys.pattern.strategy.promotion;

class PromotionActivityTest1 {
    public static void main(String[] args) {
      PromotionActivity promotionActivity=null;
      String promotionKey ="CASHBACK";

      if ("COUPON".equals(promotionKey)){
          promotionActivity=new PromotionActivity(new CouponStrategy());
      }else if ("CASHBACK".equals(promotionKey)){
          promotionActivity=new PromotionActivity(new CashbackStrategy());
      }
      promotionActivity.execute();
    }
}