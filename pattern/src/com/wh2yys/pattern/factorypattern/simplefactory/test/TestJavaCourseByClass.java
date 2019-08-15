package com.wh2yys.pattern.factorypattern.simplefactory.test;

import com.wh2yys.pattern.factorypattern.simplefactory.CourseFactoryByClass;
import com.wh2yys.pattern.factorypattern.simplefactory.CourseFactoryByName;
import com.wh2yys.pattern.factorypattern.simplefactory.ICourse;
import com.wh2yys.pattern.factorypattern.simplefactory.JavaCourse;

public class TestJavaCourseByClass {
    public static void main(String[] args) {


        CourseFactoryByClass factory = new CourseFactoryByClass();
        ICourse java = factory.creat(JavaCourse.class);
        java.record();

        System.out.println("dev-wh2yys git test");

        System.out.println("1111111111");
        System.out.println("22222222222");
    }
}
