package com.forever.observerPattern.guava;

import com.forever.observerPattern.gper.Question;
import com.google.common.eventbus.EventBus;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class GuavaTest {

    public static void main(String[] args) {
        EventBus event = new EventBus();
        GuavaGPer gper = GuavaGPer.getInstance();
        Question question = new Question();
        question.setAskerName("小明");
        question.setContent("guava怎么用啊？");
        gper.setQuestion(question);
        GuavaTeacher teacher = new GuavaTeacher("tom");

        //老师订阅
        event.register(teacher);

        //在gper上发布，老师就能收到通知
        event.post(gper);
    }
}
