package com.wh2yys.pattern.prototypepattern.shallowclone;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 15:26
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone( Prototype concretePrototype){
        return  (ConcretePrototype)concretePrototype.clone();
    }
}
