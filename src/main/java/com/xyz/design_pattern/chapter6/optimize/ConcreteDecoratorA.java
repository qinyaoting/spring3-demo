package com.xyz.design_pattern.chapter6.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 11:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecoratorA extends Decorator {

    //本类独有的
    private String addedState;

    @Override
    public void operation() {
       super.operation();        //先运行component的operation方法，在执行本类的功能，相当与对原有的Component进行了装饰
        addedState = "New state";
        System.out.println("具体对象A的操作");
    }
}
