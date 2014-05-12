package com.xyz.design_pattern.chapter14.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {
        Boss huhansan = new Boss();
        StockObserver1 tongshi1 = new StockObserver1("tom",huhansan);
        NBAObserver1 tongshi2 = new NBAObserver1("xiaoming",huhansan);

        huhansan.attach(tongshi1);
        huhansan.attach(tongshi2);

        huhansan.detach(tongshi1);

        huhansan.set("我呼喊三又回来了");
        huhansan.notif();

    }
}
