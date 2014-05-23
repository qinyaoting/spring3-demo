package com.xyz.design_pattern.chapter23.optimize2;


import com.xyz.design_pattern.chapter23.optimize.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class BakeMuttonCommand extends Command {


    public BakeMuttonCommand(com.xyz.design_pattern.chapter23.optimize.Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
