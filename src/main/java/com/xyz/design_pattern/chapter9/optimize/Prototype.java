package com.xyz.design_pattern.chapter9.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class Prototype {

    //原型模式 Prototype ，用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象

    private String id;

    protected Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract Prototype cloneObj();

}
