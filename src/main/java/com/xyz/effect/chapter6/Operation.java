package com.xyz.effect.chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/27/14
 * Time: 9:30 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Operation {

    PLUS, MINUS, TIMES, DIVIDE;

    double apple(double x,double y) {
        switch (this) {
            case PLUS: return x+y;
            case MINUS: return x-y;
            case TIMES: return x*y;
            case DIVIDE: return x/y;
        }
        throw new AssertionError("Unkown op:" + this);
    }

    //如果添加了新的枚举常量，忘记给switch添加响应的条件，仍然可以编译，但是当你
    //试图运用恶心的运算时，就会失败


}
