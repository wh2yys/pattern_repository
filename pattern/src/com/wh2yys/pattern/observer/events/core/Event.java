package com.wh2yys.pattern.observer.events.core;

import java.lang.reflect.Method;

/**
 * @author wh
 * @description
 * @date 2019/9/14
 */
public class Event {

    /**
     * 事件源,事件是由谁发起的保存起来
     */
    private Object source;
    /**
     * 事件触发,要通知谁
     */
    private Object target;
    /**
     * 事件触发要做什么动作 回调
     */
    private Method callback;

    /**
     * 事件的名称,触发的是什么事件
     */
    private String trigger;
    /**
     * 事件触发的时间
     */
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
