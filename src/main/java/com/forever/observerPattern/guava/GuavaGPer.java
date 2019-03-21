package com.forever.observerPattern.guava;

import com.forever.observerPattern.gper.Question;

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

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
