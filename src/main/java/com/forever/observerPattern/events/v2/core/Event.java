package com.forever.observerPattern.events.v2.core;

import java.lang.reflect.Method;

/**
 *
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class Event {

    private Object source; //属于内奸，监视被观察者，并报告观察者，此处为listener

    private Object target;  //观察者，来执行相应的动作

    private Method callback;  //观察者要执行的具体动作

    private String trigger;  //被观察者触发的动作

    private Long time;  //观察者执行事件的时间

    public Event(Object target, Method callback){
        this.target = target;
        this.callback = callback;
    }

    public Event setTrigger(String trigger){
        this.trigger = trigger;
        return this;
    }

    public Event setSource(Object source){
        this.source = source;
        return this;
    }

    public Event setTime(Long time){
        this.time = time;
        return this;
    }

    public Method getCallback(){
        return this.callback;
    }

    public Object getTarget(){
        return this.target;
    }

    public String getTrigger(){
        return this.trigger;
    }

    @Override
    public String toString() {
        return "=================================================" +
                "\nsource==="+this.source+"\ntarget==="+this.target+"\ncallback==="+this.callback+
                "\ntrigger==="+this.trigger+"\ntime==="+this.time+
                "================================================";
    }
}
