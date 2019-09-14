package com.wh2yys.pattern.template.course;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public class BigDataCourse extends NetworkCourse {
    private boolean needHomeworkFlag=false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据课程的课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
