package com.wh2yys.pattern.prototypepattern.shallowclone;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcretePrototypeTest
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 15:21
 */
public class ConcretePrototypeTest {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("wh2yys");
        List hobbies = new ArrayList<String>();
        hobbies.add("ball");
        hobbies.add("basketball");
        hobbies.add("sing");
        prototype.setHobbies(hobbies);
        System.out.println(prototype);
        Client client = new Client(prototype);
        ConcretePrototype prototype1 = (ConcretePrototype) client.startClone(prototype);
        System.out.println(prototype1);
        System.out.println(prototype.getHobbies());
        System.out.println(prototype1.getHobbies());
        System.out.println(prototype.getHobbies()==prototype1.getHobbies());
    }
}
