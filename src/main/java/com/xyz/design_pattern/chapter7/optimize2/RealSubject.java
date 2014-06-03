package com.xyz.design_pattern.chapter7.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实请求...");
    }
}
