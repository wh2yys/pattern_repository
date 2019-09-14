package com.wh2yys.pattern.template.course;

class NetworkCourseTest {

    public static void main(String[] args) {
        NetworkCourse course=new BigDataCourse(true);
        course.createCourse();
        System.out.println("------------------------------");
        NetworkCourse course1=new JavaCouese();
        course1.createCourse();
    }
}