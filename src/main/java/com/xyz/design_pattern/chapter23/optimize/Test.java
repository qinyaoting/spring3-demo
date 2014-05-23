package com.xyz.design_pattern.chapter23.optimize;


/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {

        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonChickrenWindCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonChickrenWindCommand(boy);
        Command bakeChickrenWindCommand1 = new BakeMuttonChickrenWindCommand(boy);

        Waiter girl = new Waiter();
        girl.setOrder(bakeMuttonCommand1);
        girl.notif();
        girl.setOrder(bakeMuttonCommand2);
        girl.notif();
        girl.setOrder(bakeChickrenWindCommand1);
        girl.notif();
    }
}
