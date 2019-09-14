package com.wh2yys.pattern.template.course;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public abstract class NetworkCourse {
    protected final void createCourse(){
        this.postPreResource();
        this.createPPT();
        this.liveVideo();
        this.postNote();
        this.postSource();
        if (needHomework()){
            checkHomework();
        }
    }

    /**
     * 抽象方法 交给子类去实现 用于方法的具体实现
     */
    abstract void checkHomework();

    /**
     *钩子方法,用于方法的微调
     * @return
     */
    protected boolean needHomework(){
        return false;
    }

    final void postSource(){
        System.out.println("上传源代码");
    }
    final void postNote(){
        System.out.println("上传资料");
    }

    final void liveVideo(){
        System.out.println("直播授课");
    }
    final void createPPT(){
        System.out.println("创建上课PPT");
    }
    final void postPreResource(){
        System.out.println("发布预习资料");
    }
}
