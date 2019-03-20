package com.forever.observerPattern.events.v2.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 观察者与被观察者交流的纽带，可视为（内奸）
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public abstract class EventListener {

    protected Map<String, Event> events = new HashMap<String, Event>();

    public void addListener(String eventype, Object target){
        try{
            this.addListener(
                    eventype,
                    target,
                    target.getClass().getMethod("on"+toUpperFirstCase(eventype),Event.class)
            );
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //要记录被观察者哪些行为
    private void addListener(String eventype, Object target, Method callback){
        if(events.containsKey(eventype)){
            return;
        }
        events.put(eventype, new Event(target, callback));
    }

    public void trigger(String trigger){
        if(!this.events.containsKey(trigger)){
            return;
        }
        trigger(this.events.get(trigger).setTrigger(trigger));
    }

    //观察者采取行动
    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try{
            if(event.getCallback()!=null){
                event.getCallback().invoke(event.getTarget(),event);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private String toUpperFirstCase(String eventype) {
        char[] cs = eventype.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }
}
