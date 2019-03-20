package com.forever.observerPattern.events.v2.mouseEvent;

import com.forever.observerPattern.events.v2.core.EventListener;

/**
 * 被观察着，动作的触发着
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class Mouse extends EventListener {

    public void click(){
        System.out.println("鼠标========我单击了");
        this.trigger(MouseEventype.ON_CLICK);
    }

    public void focus(){
        System.out.println("鼠标========我聚焦了");
        this.trigger(MouseEventype.ON_FOCUS);
    }

}
