package com.xyz.design_pattern.chapter14.optimize2;

import com.xyz.design_pattern.chapter14.Secretary;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class StockObserver1 extends  Observer {


    public StockObserver1(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(name + ":" + sub.get() + "关闭股票行情，继续工作");
    }
}
