package com.wh2yys.pattern.observer.gperadvice;

class GperTest {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Teacher tom=new Teacher("tom");
        Teacher mic=new Teacher("mic");
        gper.addObserver(tom);
        gper.addObserver(mic);
        Question question=new Question();
        question.setUsername("wh");
        question.setContent("这道题不会这么办");
        gper.publishQuestion(question);
    }

}