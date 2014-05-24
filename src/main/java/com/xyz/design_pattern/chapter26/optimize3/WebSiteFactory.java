package com.xyz.design_pattern.chapter26.optimize3;

import com.xyz.design_pattern.chapter26.optimize2.*;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 11:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class WebSiteFactory {

    private Hashtable flyweights = new Hashtable();

    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.contains(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return (WebSite)flyweights.get(key);
    }

    public int getWebSiteCount() {
        return flyweights.size();
    }



    public static final void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = f.getWebSiteCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = f.getWebSiteCategory("产品展示");
        fz.use(new User("娇娇"));

        WebSite f1 = f.getWebSiteCategory("博客");
        f1.use(new User("老万通"));

        System.out.println("网站分类总数：" + f.getWebSiteCount());
    }

    // 享元模式
    // 如果一个应用程序使用了大量的对象，而大量的这些对象造成了很大的存储开销，就应该考虑使用
    // 对象的大多数状态可以外部状态，如果删除对象外部状态，那么可以用相对较少的共享对象取代很多组对象，也应该考虑使用
}
