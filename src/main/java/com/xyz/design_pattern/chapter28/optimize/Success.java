package com.xyz.design_pattern.chapter28.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Success extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getName() + " " + this.getClass().getName() + " ，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getName() + " " + this.getClass().getName() + " ，背后多半有一个不成功的男人");
    }
}
