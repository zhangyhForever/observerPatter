package com.forever.observerPattern.gper;

import java.util.Observable;
import java.util.Observer;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param o 被观察者
     * @param arg 观察内容（什么东西发生变化需要通知观察者）
     */
    public void update(Observable o, Object arg) {
        GPer gper = (GPer)o;
        Question question = (Question)arg;
        System.out.println(name+"老师，你好！\n您的学生在"+gper.getName()+"上提出了一个问题：\n" +
                "问题的内容是："+question.getContent()+"\n提出者："+question.getAskerName());
    }
}
