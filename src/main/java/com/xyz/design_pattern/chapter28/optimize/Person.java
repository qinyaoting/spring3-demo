package com.xyz.design_pattern.chapter28.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class Person {

    // 用来获得 '状态' 对象的
    public abstract void accept(Action visitor);
}
