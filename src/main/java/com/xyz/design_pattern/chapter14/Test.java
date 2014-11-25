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

        tongzizhe.secretaryAction("老板回来了!!!");
        tongzizhe.notif();

        // 问题：前台类和股票类相互耦合，前台类要增加观察者，观察者要获得前台的状态


    }
}
