package com.forever.observerPattern.events.v1;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class EventListener {

    private EventCallback callback = new EventCallback();

    public void trigger(String trigger){
        try{
            callback.getClass().getMethod(trigger).invoke(callback,null);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
