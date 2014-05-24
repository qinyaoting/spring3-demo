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

    // 实现系统可能有多角度分类，每一种分类都可能变化，那么就把这种多角度分离出来让他们独立变化，减少他们之间耦合

}
