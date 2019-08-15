package com.wh2yys.pattern.factorypattern.simplefactory.test;

import com.wh2yys.pattern.factorypattern.simplefactory.CourseFactoryByName;
import com.wh2yys.pattern.factorypattern.simplefactory.ICourse;
import com.wh2yys.pattern.factorypattern.simplefactory.JavaCourse;

public class TestJavaCourseByName {
    public static void main(String[] args) {
//        JavaCourse javaCourse = new JavaCourse();
//        javaCourse.record();

        CourseFactoryByName factory = new CourseFactoryByName();
        ICourse java = factory.creat("java");
        java.record();

    }
}
