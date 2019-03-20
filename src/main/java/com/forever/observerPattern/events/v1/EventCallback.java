package com.forever.observerPattern.events.v1;

/**
 * 观察者，根据鼠标的动作来触发相应的事件
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class EventCallback {

    public void onClick(){
        System.out.println("触发单击事件");
    }

    public void onFocus(){
        System.out.println("触发聚焦事件");
    }
}
