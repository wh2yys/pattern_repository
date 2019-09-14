package com.wh2yys.pattern.adapter.objectadapter;

/**
 * @author wh
 * @description
 * @date 2019/9/13
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5v() {
        int adapterInput=ac220.outputAC220();
        int adapterOutput=adapterInput/44;
        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V,输出直流为:"+adapterOutput);
        return adapterOutput;
    }
}
