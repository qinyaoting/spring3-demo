package com.xyz.design_pattern.chapter22.optimize4;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 2:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void opertion() {
        implementor.operation();
    }
}
