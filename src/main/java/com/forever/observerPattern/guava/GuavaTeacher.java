package com.forever.observerPattern.guava;

import com.forever.observerPattern.gper.GPer;
import com.forever.observerPattern.gper.Question;
import com.google.common.eventbus.Subscribe;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class GuavaTeacher {

    private String name;

    public GuavaTeacher(GPer gper){

    }

    @Subscribe
    public void notice(Question question){
        System.out.println("老师，你好！您收到信息");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
