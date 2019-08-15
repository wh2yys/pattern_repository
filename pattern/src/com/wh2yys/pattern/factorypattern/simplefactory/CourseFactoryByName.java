package com.wh2yys.pattern.factorypattern.simplefactory;

public class CourseFactoryByName {
    public ICourse creat(String name){
            if ("java".equals(name)){
                return new JavaCourse();
            }else if ("python".equals(name)){
                return new PythonCourse();
            }else {
                return null;
            }
    }
}
