package com.xyz.effect.chapter4.num17;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/15/14
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Super {



    //构造器绝不能调用可被覆盖的方法
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
        System.out.println("xxx");
    }
}
