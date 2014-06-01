package com.xyz.design_pattern.chapter28.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Man extends Person{
    @Override
    public void accept(Action visitor) {

        //首先客户端程序将状态作为参数传递给男人类，完成第一次分派
        // 然后男人 调用作为参数的具体状态中的方法男人反应，同时将自己作为参数传递进去，完成第二次分派
        visitor.getManConclusion(this);
    }
}
