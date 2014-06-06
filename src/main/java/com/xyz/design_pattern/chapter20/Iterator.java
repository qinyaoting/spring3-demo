package com.xyz.design_pattern.chapter20;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:49 PM
 * To change this template use File | Settings | File Templates.
 */

//抽象类
abstract class Iterator {

    public abstract Object first();    //声明四个方法
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
