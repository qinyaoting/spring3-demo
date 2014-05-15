package com.xyz.design_pattern_chapter19;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 5:49 PM
 * To change this template use File | Settings | File Templates.
 */
abstract   class Component {

    protected String name;

    protected Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);


}
