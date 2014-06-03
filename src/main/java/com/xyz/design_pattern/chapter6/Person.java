package com.xyz.design_pattern.chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("" + name);
    }
}
