package com.wh2yys.pattern.prototypepattern.deepclone;

import java.io.Serializable;

/**
 * @ClassName JinGuBang
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 15:47
 */
public class JinGuBang implements Serializable {
    private float h = 100f;
    private float d = 10f;

    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
