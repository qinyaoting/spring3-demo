package com.xyz.design_pattern.chapter6.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 11:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecoratorB extends Decorator {

    private String addedState;

    @Override
    public void operation() {
       super.operation();
        addedBehavior();
        System.out.println("具体对象B的操作");
    }

    //本类独有的方法
    private void addedBehavior() {

    }

    //装饰模式 Decorator 动态的该一个对象添加一些额外的职责，就增加功能来说，装饰模式比子类更灵活

    public static final void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}
