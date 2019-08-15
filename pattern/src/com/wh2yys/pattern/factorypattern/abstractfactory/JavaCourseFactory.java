package com.wh2yys.pattern.factorypattern.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public IVideo CreateVideo() {
        return new JavaVideo();
    }

    @Override
    public INote CreateNote() {
        return new JavaNote();
    }
}
