package com.xyz.design_pattern.chapter20;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int count() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    public void set(Object obj) {
        items.add(obj);
    }
}
