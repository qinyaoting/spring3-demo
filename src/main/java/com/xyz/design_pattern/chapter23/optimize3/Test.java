package com.xyz.design_pattern.chapter23.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();
        i.setCommand(c);
        i.executeCommand();
    }
}
