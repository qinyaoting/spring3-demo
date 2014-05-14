package com.xyz.design_pattern.chapter17;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 适配器模式（adapter）将一个类的接口转换成客户希望的另外一个接口
    //

    public static final void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
