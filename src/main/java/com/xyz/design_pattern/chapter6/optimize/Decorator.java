package com.xyz.design_pattern.chapter6.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 11:06 AM
 * To change this template use File | Settings | File Templates.
 */

//抽象类
abstract class Decorator extends Component {  //继承了Component

    //一个Component属性
    protected Component component;

    //设置component
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null)
            component.operation();   //重写方法
    }
}
