package com.forever.observerPattern.events.v2;

import com.forever.observerPattern.events.v2.mouseEvent.EventCallback;
import com.forever.observerPattern.events.v2.mouseEvent.Mouse;
import com.forever.observerPattern.events.v2.mouseEvent.MouseEventype;

/**
 * @ Author       : forever
 * @ Date         : Created in 2019/3/20
 * @ Description  : what to do ...
 */
public class v2Test {

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        EventCallback callback = new EventCallback();

        mouse.addListener(MouseEventype.ON_CLICK, callback);
        mouse.click();
        mouse.addListener(MouseEventype.ON_FOCUS, callback);
        mouse.focus();
    }

}
