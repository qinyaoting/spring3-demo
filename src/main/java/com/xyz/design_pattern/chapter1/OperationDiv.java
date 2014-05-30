package com.xyz.design_pattern.chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 10:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class OperationDiv extends Operation {


    @Override
    public double getResult() {
        if (getNumberB() == 0)
            throw new IllegalArgumentException("除数不能为0");
        return getNumberA() / getNumberB();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
