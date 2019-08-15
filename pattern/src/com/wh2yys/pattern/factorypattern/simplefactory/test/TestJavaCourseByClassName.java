package com.wh2yys.pattern.factorypattern.simplefactory.test;

import com.wh2yys.pattern.factorypattern.simplefactory.CourseFactoryByClassName;
import com.wh2yys.pattern.factorypattern.simplefactory.CourseFactoryByName;
import com.wh2yys.pattern.factorypattern.simplefactory.ICourse;

public class TestJavaCourseByClassName {
    public static void main(String[] args) {
        CourseFactoryByClassName factory = new CourseFactoryByClassName();
        ICourse java = factory.creat("com.wh2yys.pattern.factorypattern.simpl efactory.JavaCourse");
        java.record();
    }
}
