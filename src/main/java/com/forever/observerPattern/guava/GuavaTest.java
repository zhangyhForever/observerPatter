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
        GuavaTeacher teacher = new GuavaTeacher(event);
        teacher.setName("forever");
        GuavaGPer gper = GuavaGPer.getInstance();
        event.register(gper);
        Question question = new Question();
        question.setAskerName("小明");
        question.setContent("guava怎么用啊？");
        event.post(question);
    }
}
