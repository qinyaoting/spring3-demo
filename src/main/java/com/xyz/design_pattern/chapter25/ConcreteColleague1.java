package com.xyz.design_pattern.chapter25;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 12:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteColleague1 extends Colleague{

    protected ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notif(String message) {
        System.out.println("同事1得到消息：" + message);
    }
}
