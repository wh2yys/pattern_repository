package com.wh2yys.pattern.factorypattern.simplefactory;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
