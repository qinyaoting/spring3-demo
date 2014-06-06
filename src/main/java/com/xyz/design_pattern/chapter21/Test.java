package com.xyz.design_pattern.chapter21;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {


        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2)
            System.out.print("同一个实例");

        // 与实用类的区别
        // 实用类仅提供一些静态方法，而单例类是有状态的，实用类不能继承多态
        // 单例虽然实例唯一，但可以子类继承，
    }
}
