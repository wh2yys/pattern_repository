package com.wh2yys.pattern.singleton.hungrysingleton;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式单例
 * @Author wh2yys
 * @Date 2019/8/16 14:30
 */
public class HungrySingleton {
    private static final HungrySingleton singleton=new HungrySingleton();
    private HungrySingleton(){}
    /**
     * @Author:  wh2yys
     * @Description: //TODO
     * @Date:  14:52 2019/8/16
     * @Param:  No such property: code for class: Script1
     * @Return:  com.wh2yys.pattern.singleton.hungrysingleton.HungrySingleton
     */
    public static HungrySingleton getNewInsatace(){
        return singleton;
    }

}
