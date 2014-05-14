package com.xyz.effect.chapter1.optimize2;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Elvis implements Serializable {


    /*public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {}*/

    // 享有特权的客户端可以通过反射调用私有构造器

    //=========================================================

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {}


    public static final void main(String[] args) {
        Elvis instance = Elvis.getInstance();
        // 都会返回同一个对象
    }


    private Object readResolve() {
        return INSTANCE;
    }
}


