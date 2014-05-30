package com.xyz.design_pattern.chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 10:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class OperationAdd extends Operation {


    @Override
    public double getResult() {
        return getNumberA() + getNumberB();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
