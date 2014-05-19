package com.xyz.design_pattern.chapter20;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {


    // 迭代器模式：提供一种方法顺序访问一个聚合对象中的哥哥元素，而有不暴露该对象的内部表示

    public static final void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();

        a.set("大鸟");
        a.set("小菜");
        a.set("行李");
        a.set("老外");
        a.set("公交内部员工");
        a.set("小偷");

        Iterator i = new ConcreteIterator(a);
        Object item = i.first();
        while(!i.isDone()) {
            System.out.println(i.currentItem() + " 请买票" );
            i.next();
        }

    }
}
