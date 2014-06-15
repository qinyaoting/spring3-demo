package com.xyz.effect.chapter4.num17;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/15/14
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sub extends Super {

    private final Date date;

    Sub() {
        date = new Date();
    }

    public void overrideMe() {
        System.out.println(date);


    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();

        //期望打印两次日期，但是第一次打印出的是null，
        //因为父类构造器调用早于子类，父类调用构造器的时候，子类还没初始化date

        //为了继承而设计，Cloneable Serializable接口出现了特殊困难
    }
}
