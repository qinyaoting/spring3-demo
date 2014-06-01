package com.xyz.design_pattern.chapter28.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class Action {

    // 得到男人的结论或反应
    public abstract void getManConclusion(Man concreteElementA);

    // 得到女人的结论或反应
    public abstract void getWomanConclusion(Woman concreteElementB);
}
