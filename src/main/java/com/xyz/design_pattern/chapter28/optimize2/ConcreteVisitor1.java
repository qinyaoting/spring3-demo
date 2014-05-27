package com.xyz.design_pattern.chapter28.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteVisitor1 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getName() + " " + this.getClass().getName());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getName() + " " + this.getClass().getName());
    }
}
