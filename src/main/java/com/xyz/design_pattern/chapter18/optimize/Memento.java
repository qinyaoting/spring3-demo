package com.xyz.design_pattern.chapter18.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */

// 备忘录类
public class Memento {


    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
