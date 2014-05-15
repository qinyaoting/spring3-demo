package com.xyz.design_pattern_chapter19.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 6:01 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Company {

    protected String name;

    protected Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);

    public abstract void display(int depth);
    public abstract void lineOfDuty();
}
