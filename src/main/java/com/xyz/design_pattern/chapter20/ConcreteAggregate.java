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


    //[kən'kri:t, 'kɔnkri:t]
    /*
      adj. 混凝土的；实在的，具体的；有形的
      vi. 凝结
      vt. 使凝固；用混凝土修筑
     */

    //集合
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

    public void add(Object obj) {
        items.add(obj);
    }
}
