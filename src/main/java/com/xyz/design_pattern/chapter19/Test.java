package com.xyz.design_pattern.chapter19;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 5:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {
        Component root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite comp2 = new Composite("composite Y");
        comp2.add(new Leaf("Leaf YA"));
        comp2.add(new Leaf("Leaf YB"));

        root.add(comp2);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);

        //什么时候使用组合模式
        //需求中是体现部分与整体层次的结构时，你希望用户可以忽略组合对象与单个对象的不同
        // 统一的使用组合结构中的所有对象时，

    }
}
