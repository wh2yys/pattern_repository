package com.wh2yys.pattern.factorypattern.factorymethod;

import com.wh2yys.pattern.factorypattern.simplefactory.ICourse;
import com.wh2yys.pattern.factorypattern.simplefactory.JavaCourse;
import com.wh2yys.pattern.factorypattern.simplefactory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
