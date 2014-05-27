package com.xyz.design_pattern.chapter28;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class Person {

    protected String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public abstract void getConclusion();

    //[kənˈklu:ʒn]    结论；结局；断定，决定；推论
}
