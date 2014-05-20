package com.xyz.design_pattern.chapter23.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteCommand extends Command {


    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
