package com.xyz.effect.chapter2.num3;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Elvis implements Serializable {

    // 使用私有构造器或者枚举类型强化singleton属性


    //第一种 构造器私有 静态共有final方法，返回唯一对象
    /*public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {}*/

    // 享有特权的客户端可以通过反射调用私有构造器

    //=========================================================


    //第二种 构造器私有 静态共有方法，返回对象引用
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {     //方便扩展，可以返回不是单实例的
        return INSTANCE;
    }

    public void leaveTheBuilding() {}


    public static final void main(String[] args) {
        Elvis instance = Elvis.getInstance();
        // 都会返回同一个对象
    }

    // 方式反实例化时，创建多个实例，第一 implements Serializable 第二 增加下列方法
    private Object readResolve() {
        return INSTANCE;
    }
}


