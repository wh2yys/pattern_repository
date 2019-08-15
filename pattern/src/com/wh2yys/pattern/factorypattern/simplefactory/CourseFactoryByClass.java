package com.wh2yys.pattern.factorypattern.simplefactory;

public class CourseFactoryByClass {
    public ICourse creat(Class<? extends ICourse> clazz) {

        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
