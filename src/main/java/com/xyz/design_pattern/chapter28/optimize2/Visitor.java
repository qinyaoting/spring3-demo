package com.xyz.design_pattern.chapter28.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
