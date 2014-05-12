package com.xyz.design_pattern.chapter14.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class NBAObserver1 extends  Observer {


    public NBAObserver1(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(name + ":" + sub.get() + "关闭NBA，继续工作");
    }
}
