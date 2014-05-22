package com.xyz.design_pattern.chapter26.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class UnsharedFlyweight extends Flyweight {


    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight:" + extrinsicstate);
    }
}
