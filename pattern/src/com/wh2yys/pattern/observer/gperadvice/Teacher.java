package com.wh2yys.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wh
 * @description
 * @date 2019/9/14
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
    Gper gper= (Gper) observable;
    Question question= (Question) o;
        System.out.println("================================");
        System.out.println(name+"老师 你好\n"+"你收到来自于"+gper.getName()+"的提问,希望你解答.问题如下:\n"+question.getContent()+"\n"+"提问者:"+question.getUsername());
    }
}
