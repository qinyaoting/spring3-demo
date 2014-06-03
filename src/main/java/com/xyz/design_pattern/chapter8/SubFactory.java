package com.xyz.design_pattern.chapter8;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/3/14
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
