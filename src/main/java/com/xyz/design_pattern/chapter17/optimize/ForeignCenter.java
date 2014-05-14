package com.xyz.design_pattern.chapter17.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void chonga() {
        System.out.println("外籍中锋:" + name + "进攻@");
    }

    public void fengshou() {
        System.out.println("外籍中锋:" + name + "回防@");
    }

    public ForeignCenter() {
    }
}
