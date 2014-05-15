package com.xyz.design_pattern.chapter18.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 5:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return  new Memento(state);
    }

    public void setMemento(Memento memento) {
        memento.setState(state);
    }

    public void show() {
        System.out.println("state:" + state);
    }
}
