package com.xyz.design_pattern.chapter22.optimize4;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {

        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.opertion();

        ab.setImplementor(new ConcreteImplementorA());
        ab.opertion();
    }

}
