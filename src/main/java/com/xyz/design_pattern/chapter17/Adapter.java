package com.xyz.design_pattern.chapter17;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Adapter extends Target {

    // 建立一个私有的Adaptee对象
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // 这样就可以把表面上调用reqestu()
        // 方法变成实际调用specificRequest()
        adaptee.specificRequest();
    }
}
