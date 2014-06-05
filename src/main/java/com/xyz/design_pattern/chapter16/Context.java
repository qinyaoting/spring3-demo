package com.xyz.design_pattern.chapter16;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Context {


    //里边有个State属性
    private State state;

    public Context(State state) { //传进来
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);  //将执行ConcreteStateA对象中的handle方法
    }
}
