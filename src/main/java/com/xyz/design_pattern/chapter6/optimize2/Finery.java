package com.xyz.design_pattern.chapter6.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */

//服饰类 Decorator
public class Finery extends Person {

    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }


    @Override
    public void show() {
        if (component != null)
            component.show();
    }
}
