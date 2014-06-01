package com.xyz.design_pattern.chapter28.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        // 利用双分派技术，实现处理与数据结构的分离
        visitor.visitConcreteElementA(this);
    }

    // 其他的相关方法
    public void operationA() {

    }
}
