package com.xyz.design_pattern.chapter10.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类B方法1 实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B方法2 实现");    }


    // 20141125
    public static final void main(String[] args) {

        AbstractClass c;
        c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();
    }
}
