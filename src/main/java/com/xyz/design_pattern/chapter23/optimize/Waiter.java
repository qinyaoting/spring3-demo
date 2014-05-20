package com.xyz.design_pattern.chapter23.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 2:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Waiter {

    private Command command;

    public void setOrder(Command command) {
        this.command = command;
    }

    public void notif() {
        command.executeCommand();
    }
}
