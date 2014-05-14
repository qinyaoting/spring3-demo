package com.xyz.design_pattern.chapter16;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestContext {


    public static final void main(String[] args) {
        Context c = new Context(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
