package com.wh2yys.pattern.observer.events.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wh
 * @description
 * @date 2019/9/14
 */
public class EventLisenter {
    protected Map<String, Event> eventMap = new HashMap<>();

    public void addLisenter(String eventType, Object target) {
        try {
            this.addLisenter(eventType, target, target.getClass().getMethod("on" + toUpperFirstCase(eventType), Event.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void addLisenter(String eventType, Object target, Method callback) {
        eventMap.put(eventType, new Event(target, callback));
    }

    /**
     * 只要有动作就出发
     * @param event
     */
    public void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        if (event.getCallback()!=null){
            try {
                event.getCallback().invoke(event.getTarget(),event);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

    }
    public void trigger(String trigger) {
      if (!this.eventMap.containsKey(trigger)){
          return ;
      }
      trigger(this.eventMap.get(trigger).setTrigger(trigger));
    }
    private String toUpperFirstCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] -=32;
        return String.valueOf(chars);
    }
}
