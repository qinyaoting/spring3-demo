package com.xyz.design_pattern.chapter17.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Player {

    protected String name;

    protected Player(String name) {
        this.name = name;
    }

    public abstract void attach();
    public abstract void defense();

    protected Player() {
    }
}
