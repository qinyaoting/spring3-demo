package com.xyz.design_pattern.chapter17.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Forwards extends Player {


    protected Forwards(String name) {
        super(name);
    }

    @Override
    public void attach() {
        System.out.println("前锋：" + name + " 进攻！");
    }

    @Override
    public void defense() {
        System.out.println("前锋：" + name + " 防守！");
    }
}
