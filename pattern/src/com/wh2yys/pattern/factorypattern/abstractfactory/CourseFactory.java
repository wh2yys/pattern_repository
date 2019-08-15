package com.wh2yys.pattern.factorypattern.abstractfactory;

public interface CourseFactory {
    IVideo CreateVideo();

    INote CreateNote();
}
