package com.wh2yys.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public class PayStrategy {
    public static final String ALI_PAY="AliPay";
    public static final String JD_PAY="JDPay";
    public static final String WECHAT_PAY="WeChatPay";
    public static final String UNION_PAY="UnionPay";
    public static final String DEFAULT_PAY=ALI_PAY;
    private static Map<String,Payment> paymentMap=new HashMap<>();
    static {
        paymentMap.put(ALI_PAY,new AliPay());
        paymentMap.put(JD_PAY,new JDPay());
        paymentMap.put(WECHAT_PAY,new WeChatPay());
        paymentMap.put(UNION_PAY,new UnionPay());
    }
    public static Payment get(String payKey){
        if (!paymentMap.containsKey(payKey)){
            return paymentMap.get(DEFAULT_PAY);
        }
        return paymentMap.get(payKey);
    }
}
