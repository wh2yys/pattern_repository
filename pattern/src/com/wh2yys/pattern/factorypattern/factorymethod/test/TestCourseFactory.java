package com.wh2yys.pattern.factorypattern.factorymethod.test;

import com.wh2yys.pattern.factorypattern.factorymethod.ICourseFactory;
import com.wh2yys.pattern.factorypattern.factorymethod.JavaCourseFactory;
import com.wh2yys.pattern.factorypattern.factorymethod.PythonCourseFactory;
import com.wh2yys.pattern.factorypattern.simplefactory.ICourse;

public class TestCourseFactory {
    public static void main(String[] args) {
        ICourseFactory javaFactory = new JavaCourseFactory();
        ICourse javaCourse = javaFactory.create();
        javaCourse.record();

        ICourseFactory pythonFactory = new PythonCourseFactory();
        ICourse pythonCourse = pythonFactory.create();
        pythonCourse.record();
    }
}
