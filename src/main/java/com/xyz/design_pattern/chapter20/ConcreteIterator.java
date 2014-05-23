package com.xyz.design_pattern.chapter20;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */

// 具体的,有形的;实在的,实际的

public class ConcreteIterator extends Iterator {

    // 定义了一个具体聚集对象
    private ConcreteAggregate aggregate;
    private int current = 0;

    // 初始化时，将具体对象传入
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < aggregate.count()) {
            ret = aggregate.get(current);
        }
        return ret;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.count()?true:false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
