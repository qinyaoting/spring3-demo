package com.xyz.design_pattern.chapter23.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    abstract public void executeCommand();
}
