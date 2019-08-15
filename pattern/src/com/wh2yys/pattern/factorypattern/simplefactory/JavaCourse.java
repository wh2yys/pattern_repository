package com.wh2yys.pattern.factorypattern.simplefactory;

public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}
