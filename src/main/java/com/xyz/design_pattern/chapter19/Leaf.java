package com.xyz.design_pattern.chapter19;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Leaf extends Component {

    protected Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf" );
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove to a leaf" );
    }

    @Override
    public void display(int depth) {
        System.out.println("depth:" + depth + " name:" + name );
    }
}
