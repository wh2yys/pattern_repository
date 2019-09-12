package com.wh2yys.pattern.strategy.pay;

import java.util.Date;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public class MsgResult {
    private int code;
    private Object data;
    private String msg;

    public MsgResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "支付状态：[" + code + "], 交易详情：" + data ;
    }
}
