package com.xyz.effect.chapter1.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */

// 静态工具类，里边都是静态方法，如何避免被实例化
public class UtilityClass {

    // 构造器私有，确保类不可被实例化
    private UtilityClass(){
        throw new AssertionError();
    }

    public static void tttt() {
        //......
    }
}
