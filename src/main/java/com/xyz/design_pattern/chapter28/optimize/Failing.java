package com.xyz.design_pattern.chapter28.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Failing extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getName() + " " + this.getClass().getName() + " ，闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getName() + " " + this.getClass().getName() + " ，眼泪汪汪，谁也劝不了");
    }
}
