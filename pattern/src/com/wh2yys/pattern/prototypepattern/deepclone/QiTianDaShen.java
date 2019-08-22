package com.wh2yys.pattern.prototypepattern.deepclone;

import java.io.*;
import java.util.Date;

/**
 * @ClassName QiTianDaShen
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 15:51
 */
public class QiTianDaShen extends Monkey implements Serializable, Cloneable {
    public JinGuBang jinGuBang;

    public QiTianDaShen() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            QiTianDaShen copy = (QiTianDaShen) ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public QiTianDaShen shallowClone(QiTianDaShen target){
        QiTianDaShen qiTianDaShen = new QiTianDaShen();
        qiTianDaShen.height=target.height;
        qiTianDaShen.weight=target.weight;
        qiTianDaShen.birthday=new Date();
        qiTianDaShen.jinGuBang=target.jinGuBang;
        return qiTianDaShen;
    }
}
