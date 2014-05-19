package com.xyz.design_pattern.chapter20;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteIteratorDesc extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.count() -1;
    }

    @Override
    public Object first() {
        return aggregate.get(aggregate.count()-1);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object next() {
        Object ret = null;
        current--;
        if (current >= 0) {
            ret = aggregate.get(current);
        }
        return ret;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isDone() {
        return current<0?true:false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
