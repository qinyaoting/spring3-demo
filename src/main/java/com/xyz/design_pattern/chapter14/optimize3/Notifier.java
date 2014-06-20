package com.xyz.design_pattern.chapter14.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/20/14
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Notifier {

    private EventHandler eventHandler=new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }
    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
    //增加需要帮忙放哨的学生
    public abstract void addListener(Object object,String methodName,Object...args);
    //告诉所有要帮忙放哨的学生：老师来了
    public abstract void notifyX();
}
