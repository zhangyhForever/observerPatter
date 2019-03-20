package com.forever.observerPattern.gper;

import java.util.Observable;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class GPer extends Observable {

    private static GPer gper = null;

    private static String name = "GPer生态圈";

    private GPer(String name){
        this.name = name;
    }

    public static GPer getInstance(){
        if(gper == null){
            synchronized(GPer.class){
                if(gper == null){
                    gper = new GPer(name);
                }
            }
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publish(Question question){
        System.out.println("================================");
        setChanged();
        notifyObservers(question);
    }
}
