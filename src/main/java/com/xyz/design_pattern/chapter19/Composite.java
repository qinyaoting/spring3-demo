package com.xyz.design_pattern.chapter19;

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

    //[kəmˈpɑzɪt]

    /*
    adj.混合成的，综合成的；[建]综合式的；[数]可分解的；[植]菊科的
    n. 合成物，混合物，复合材料；[植]菊科植物
     */

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
        for(Component component: children) {
            component.display(depth + 2);
        }
    }
}
