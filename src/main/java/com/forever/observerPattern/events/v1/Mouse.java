package com.forever.observerPattern.events.v1;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class Mouse extends EventListener{

    public void click(){
        System.out.println("我单击了");
        super.trigger("onClick");
    }

    public void focus(){
        System.out.println("我聚焦了");
        super.trigger("onFocus");
    }

}
