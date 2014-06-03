package com.xyz.design_pattern.chapter7.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Proxy extends Subject {

    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
         realSubject.request();
    }


    public static final void main(String[] args) {


        Proxy proxy = new Proxy();
        proxy.request();
    }
}
