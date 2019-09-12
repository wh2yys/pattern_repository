package com.wh2yys.pattern.strategy.pay.payport;

import com.wh2yys.pattern.strategy.pay.MsgResult;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public abstract class Payment {
    /**
     * @return 支付方式
     */
    public abstract String getName();

    /**
     * @param uid
     * @return 支付余额查询
     */
    protected abstract double queryBalance(String uid);
    public MsgResult pay(String uid,double amout){
        if (queryBalance(uid)<amout){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额"+amout);
    }
}
