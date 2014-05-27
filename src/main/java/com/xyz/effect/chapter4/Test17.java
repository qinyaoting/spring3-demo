package com.xyz.effect.chapter4;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/25/14
 * Time: 9:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test17 {



    //17要么为继承而设计，并提供文档说明，要么就禁止继承


    //构造器绝不能调用可被覆盖的方法
}


class Super
{
    public Super(){
        overrideMe();
    }

    public void overrideMe() {

    }
}

final class Sub extends Super {
    private final Date date;

    Sub() {
        this.date = new Date();
    }

    public void overrideMe() {
        System.out.print(date);
    }

    public static final void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }

    //期望打印两次日期，但是第一次打印出的是null，
    //因为父类构造器调用早于子类，父类调用构造器的时候，子类还没初始化date

    //为了继承而设计，Cloneable Serializable接口出现了特殊困难
}
