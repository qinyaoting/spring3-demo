package com.xyz.design_pattern.chapter13;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/4/14
 * Time: 9:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Director {

    public void Construct(Builder builder) {

        builder.buildPartA();
        builder.buildPartB();
    }

    public static void main(String[] args) {

        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        Product p2 = b2.getResult();
        p2.show();
    }
}
