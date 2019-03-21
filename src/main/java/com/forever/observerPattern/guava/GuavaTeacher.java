package com.forever.observerPattern.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class GuavaTeacher {

    private String name;

    public GuavaTeacher(String name){
        this.name = name;
    }

    @Subscribe
    public void notice(GuavaGPer gPer){
        System.out.println(name+"老师，你好！您的学生在"+gPer.getName()+"上收到信息:\n" +
                "消息的内容是："+gPer.getQuestion().getContent()+"\n来自："+gPer.getQuestion().getAskerName());
    }
}
