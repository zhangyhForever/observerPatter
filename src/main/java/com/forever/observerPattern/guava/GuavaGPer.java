package com.forever.observerPattern.guava;

import com.forever.observerPattern.gper.Question;
import com.forever.observerPattern.gper.Teacher;
import com.google.common.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class GuavaGPer {

    private static GuavaGPer gper = null;

    private Question question;

    private static String name = "GPer生态圈";

    private GuavaGPer(String name){
        this.name = name;
    }

    public static GuavaGPer getInstance(){
        if(gper == null){
            synchronized(GuavaGPer.class){
                if(gper == null) gper = new GuavaGPer(name);
            }
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publish(Question question){
        System.out.println("================================================");
        System.out.println(question.getAskerName()+"在"+gper.getName()+"上发布了一个问题：" +
                "\n问题的内容是："+question.getContent());
    }
}
