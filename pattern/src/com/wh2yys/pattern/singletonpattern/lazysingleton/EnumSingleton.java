package com.wh2yys.pattern.singletonpattern.lazysingleton;

/**
 * @ClassName EnumSingleton
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 14:24
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getDate() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
