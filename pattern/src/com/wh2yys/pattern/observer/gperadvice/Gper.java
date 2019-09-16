package com.wh2yys.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wh
 * @description
 * @date 2019/9/14
 */
public class Gper extends Observable {
    private String name="GPer生态圈";
    private static Gper gper=null;

    private Gper() {
    }
    public static Gper getInstance(){
        if (gper == null) {
            gper=new Gper();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUsername()+"在"+this.name+"上提交一个问题");
        setChanged();
        notifyObservers(question);
    }
}
