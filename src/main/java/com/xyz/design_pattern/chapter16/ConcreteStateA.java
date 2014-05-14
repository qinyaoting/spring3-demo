package com.xyz.design_pattern.chapter16;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
