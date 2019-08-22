package com.wh2yys.pattern.prototypepattern.deepclone;

/**
 * @ClassName DeepCloneTest
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 16:16
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaShen qiTianDaShen=new QiTianDaShen();
        try {
            QiTianDaShen deepClone = (QiTianDaShen) qiTianDaShen.clone();
            System.out.println("深克隆："+(qiTianDaShen.jinGuBang==deepClone.jinGuBang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        QiTianDaShen q = new QiTianDaShen();
        QiTianDaShen shallowClone = q.shallowClone(q);
        System.out.println("浅克隆："+(q.jinGuBang==shallowClone.jinGuBang));

    }
}
