package com.xyz.effect.chapter1.num3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */

// 静态工具类，里边都是静态方法，如何避免被实例化
public class UtilityClass {

    // 构造器私有，确保类不能被实例化
    private UtilityClass(){

        // Suppress default constructor for noninstantiability
        throw new AssertionError();
    }

    public static void tttt() {
        //......
    }

    // 通过私有构造器强化不可实例化的能力
    // java.lang.Math
    // java.util.Arrays
    // java.util.Collections 只包含静态方法和静态域的工具类
}
