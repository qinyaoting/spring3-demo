package com.xyz.design_pattern.chapter28.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }


    public void operationA() {

    }
}
