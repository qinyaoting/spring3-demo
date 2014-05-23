package com.xyz.design_pattern.chapter26;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 10:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class Website {

    private String name;

    public Website(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("网站分类：" + name);
    }


    public static final void main(String[] args) {

        Website fx = new Website("产品展示");
        fx.use();

        Website fy = new Website("产品展示");
        fy.use();

        Website f1 = new Website("博客");
        f1.use();

        Website fm = new Website("博客");
        fm.use();

        Website fn = new Website("博客");
        fn.use();
    }


    //享元模式 (Flyweight)运用共享技术有效的支持大力度颗粒的对象
}
