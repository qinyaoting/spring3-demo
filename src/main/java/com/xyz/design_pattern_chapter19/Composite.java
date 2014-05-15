package com.xyz.design_pattern_chapter19;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<Component>();
    protected Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for(Component c: children) {
            System.out.println(depth + 2);
        }
    }
}
