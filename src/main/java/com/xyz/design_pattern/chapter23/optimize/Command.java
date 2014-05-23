package com.xyz.design_pattern.chapter23.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer b) {
        this.receiver = b;
    }

    abstract public void executeCommand();
}
