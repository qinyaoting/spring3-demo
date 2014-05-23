package com.xyz.design_pattern.chapter24.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class Manger {

    protected Manger superior;
    protected String name;

    protected Manger(String name) {
        this.name = name;
    }

    public void setSuperior(Manger superior) {
        this.superior = superior;
    }

    abstract public void reqeustApplications(Request request);
}
