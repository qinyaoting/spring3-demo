package com.xyz.design_pattern.chapter28.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Woman extends Person {


    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
