package com.xyz.design_pattern.chapter2.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 11:35 AM
 * To change this template use File | Settings | File Templates.
 */

// 上下文
public class Context {

    Strategy strategy;

    // 初始化，传入具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 上下文接口，调用具体策略对象的算法方法
    public void contextInterface() {
        strategy.algorithmInterface();
    }


    public static final void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
