package com.xyz.design_pattern.chapter25.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class USA extends Country {


    protected USA(UniteNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message,this);
    }

    public void getMessage(String message) {
        System.out.println("美国获得对方信息：" + message);
    }
}
