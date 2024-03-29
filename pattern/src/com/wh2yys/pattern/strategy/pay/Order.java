package com.wh2yys.pattern.strategy.pay;

import com.wh2yys.pattern.strategy.pay.payport.PayStrategy;
import com.wh2yys.pattern.strategy.pay.payport.Payment;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order() {
    }

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

   public MsgResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
   }
   public MsgResult pay(String payKey){
       Payment payment = PayStrategy.get(payKey);
       System.out.println("欢迎使用:"+payment.getName());
       System.out.println("本次交易的金额为:"+amount+",开始扣款");
       return payment.pay(uid,amount);
   }
}
