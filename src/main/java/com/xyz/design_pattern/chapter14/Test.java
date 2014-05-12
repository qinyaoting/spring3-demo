package com.xyz.design_pattern.chapter14;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {
        Secretary tongzizhe = new Secretary();
        StockObserver tongshi1 = new StockObserver("tom",tongzizhe);
        StockObserver tongshi2 = new StockObserver("小明",tongzizhe);

        tongzizhe.attach(tongshi1);
        tongzizhe.attach(tongshi2);

        tongzizhe.secretartAction("老板回来了!!!");
        tongzizhe.notif();

        // 问题：


    }
}
