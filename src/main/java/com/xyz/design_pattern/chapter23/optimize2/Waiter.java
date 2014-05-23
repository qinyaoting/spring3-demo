package com.xyz.design_pattern.chapter23.optimize2;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 2:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Waiter {

    private List<Command> orders = new ArrayList<Command>();

    public void setOrder(Command command) {
        orders.add(command);
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
    }

    public void notif() {
        for (Command command : orders)
            command.executeCommand();
    }
}
