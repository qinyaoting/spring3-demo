package com.xyz.design_pattern.chapter14.optimize3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/20/14
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class EventHandler {
    //是用一个List
    private List<Event> objects;

    public EventHandler(){
        objects=new ArrayList<Event>();
    }
    //添加某个对象要执行的事件，及需要的参数
    public void addEvent(Object object,String methodName,Object...args){
        objects.add(new Event(object,methodName,args));
    }
    //通知所有的对象执行指定的事件
    public void notifyX() throws Exception{
        for(Event e : objects){
            e.invoke();
        }
    }
}
