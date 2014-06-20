package com.xyz.design_pattern.chapter6.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 11:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
       super.operation();
        addedBehavior();
        System.out.println("具体对象B的操作");
    }

    //本类独有的方法
    private void addedBehavior() {

    }

    // 装饰模式 Decorator 动态的该一个对象添加一些额外的职责，就增加功能来说，装饰模式比子类更灵活
    // 装饰模式是为已有的给你动态的添加更多功能的一种方式
    // 当系统需要新功能的时候，是向旧的类中添加新的代码，这些新的代码通常装饰了原有类的核心职责或主要行为，
    // 在主类中加入了新的字段，新的方法或新的逻辑，从而增加了主类的复杂度，
    // 这些新加入的东西仅仅是为了满足一些只在某个特定情况下才会执行的特殊行为的需要
    // 而装饰模式提供一个非常好的解决方案，他把每个要装饰的功能放在单独的类中，并让这个类包装他所要装饰的对象
    // 当需要执行特殊行为时，客户端代码就可以在运行时根据需要选择 或按顺序装饰功能包装对象1



    public static final void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}
