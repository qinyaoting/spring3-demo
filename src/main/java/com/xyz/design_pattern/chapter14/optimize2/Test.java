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

        Subject huhansan = new Boss();
        StockObserver tongshi1 = new StockObserver("tom",huhansan);
        NBAObserver tongshi2 = new NBAObserver("xiaoming",huhansan);

        huhansan.attach(tongshi1);
        huhansan.attach(tongshi2);

        huhansan.detach(tongshi1);

        huhansan.set("我呼喊三又回来了");
        huhansan.notif();

        // 什么时候用观察者：当一个对象的改变需要同时改变其他对象时，
        // 而且它不知道具体有多少对象有待改变，应考虑使用观察者模式

        // 观察者模式所做的工作其实就是解除耦合，让耦合的双方都依赖与抽象，而不是具体类
        // 从而是得各自的变化都不会影响另一边的变化



    }
}
