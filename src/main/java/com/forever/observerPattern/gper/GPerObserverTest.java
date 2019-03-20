package com.forever.observerPattern.gper;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class GPerObserverTest {

    public static void main(String[] args) {

        GPer gper = GPer.getInstance();
        Teacher teacher = new Teacher("zhang");
        Question question = new Question();
        question.setAskerName("小名");
        question.setContent("java设计模式应该怎么学习？");

        gper.addObserver(teacher);
        gper.publish(question);
    }
}
