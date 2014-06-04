package com.xyz.design_pattern.chapter10.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 11:53 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class AbstractClass {

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod() {

        primitiveOperation1();;
        primitiveOperation2();

    }

}
