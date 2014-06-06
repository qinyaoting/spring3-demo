package com.xyz.design_pattern.chapter20;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {


    // 迭代器模式(Iterator)：提供一种方法顺序访问一个聚合对象中的个个元素，而有不暴露该对象的内部表示
    // 当你需要访问一个聚合对象，而且不管这些对象是什么都需要遍历时，应该考虑用迭代器模式
    // 需要对象聚合对象有多种方式遍历时，考虑使用

    public static final void main(String[] args) {


        ConcreteAggregate a = new ConcreteAggregate();

        a.add("大鸟");
        a.add("小菜");
        a.add("行李");
        a.add("老外");
        a.add("公交内部员工");
        a.add("小偷");

        Iterator i = new ConcreteIterator(a);
        Object item = i.first();
        while(!i.isDone()) {
            System.out.println(i.currentItem() + " 请买票" );
            i.next();
        }
    }
}
