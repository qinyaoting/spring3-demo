package com.xyz.design_pattern.chapter13;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/4/14
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();
    public ConcreteBuilder1() {
    }

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
