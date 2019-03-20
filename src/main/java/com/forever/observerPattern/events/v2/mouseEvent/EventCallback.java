package com.forever.observerPattern.events.v2.mouseEvent;

import com.forever.observerPattern.events.v2.core.Event;

/**
 * 观察者，根据鼠标的动作来触发相应的事件
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class EventCallback {

    public void onClick(Event e){
        System.out.println("观察者=====鼠标触发单击事件\n"+e);
    }

    public void onFocus(Event e){
        System.out.println("观察者=====鼠标触发聚焦事件\n"+e);
    }
}
