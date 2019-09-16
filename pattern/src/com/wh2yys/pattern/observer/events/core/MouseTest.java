package com.wh2yys.pattern.observer.events.core;

class MouseTest {
    public static void main(String[] args) {
        MouseEventCallback callback=new MouseEventCallback();
        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseEventType.ON_BLUR,callback);
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_DOUBLE_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_DOWN,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);
        mouse.addLisenter(MouseEventType.ON_MOVE,callback);
        mouse.addLisenter(MouseEventType.ON_OVER,callback);
        mouse.addLisenter(MouseEventType.ON_UP,callback);
        mouse.addLisenter(MouseEventType.ON_WHEEL,callback);
        mouse.click();
        mouse.doubleClick();
    }
}