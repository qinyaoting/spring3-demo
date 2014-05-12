package com.xyz.design_pattern.chapter14;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class StockObserver {

    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update() {
        System.out.println(name + ":" + sub.getAction() + "关闭股票行情，继续工作");
    }
}
