package com.wh2yys.pattern.factorypattern.factorymethod;

import com.wh2yys.pattern.factorypattern.simplefactory.ICourse;
import com.wh2yys.pattern.factorypattern.simplefactory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
