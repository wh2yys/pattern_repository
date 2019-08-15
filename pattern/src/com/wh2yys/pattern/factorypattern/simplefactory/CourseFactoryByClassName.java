package com.wh2yys.pattern.factorypattern.simplefactory;

public class CourseFactoryByClassName {
    public ICourse creat(String className) {
        if (!("".equals(className)||className==null)){
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;

    }
}
