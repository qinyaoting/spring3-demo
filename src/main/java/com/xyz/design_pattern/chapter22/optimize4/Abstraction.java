package com.xyz.design_pattern.chapter22.optimize4;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor ip) {
        this.implementor = ip;
    }

    public void opertion() {
        implementor.operation();
    }
}
