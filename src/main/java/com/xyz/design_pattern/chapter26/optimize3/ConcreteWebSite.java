package com.xyz.design_pattern.chapter26.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteWebSite extends WebSite {

    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }
}
