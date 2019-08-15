package com.wh2yys.pattern.factorypattern.abstractfactory.test;

import com.wh2yys.pattern.factorypattern.abstractfactory.CourseFactory;
import com.wh2yys.pattern.factorypattern.abstractfactory.JavaCourseFactory;

public class TestJavaCourseFactory {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.CreateNote().note();
        factory.CreateVideo().recode();

    }
}
