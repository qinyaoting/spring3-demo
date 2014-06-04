package com.xyz.design_pattern.chapter13;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/4/14
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();

    public abstract Product getResult();
}
