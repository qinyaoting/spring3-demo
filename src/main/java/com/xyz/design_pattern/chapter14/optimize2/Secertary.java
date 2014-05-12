package com.xyz.design_pattern.chapter14.optimize2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Secertary implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notif() {

        for(Observer ob: observers)
            ob.update();
    }

    @Override
    public String get() {
        return action;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void set(String action) {
        this.action = action;
    }
}
