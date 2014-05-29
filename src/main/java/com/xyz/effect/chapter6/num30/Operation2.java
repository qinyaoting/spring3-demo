package com.xyz.effect.chapter6.num30;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/27/14
 * Time: 9:34 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Operation2 {

    PLUS    {double apply(double x, double y) {return x+y;}},
    MINUS   {double apply(double x, double y) {return x-y;}},
    TIMES   {double apply(double x, double y) {return x*y;}},
    DIVIDE  {double apply(double x, double y) {return x/y;}};

    // 声明一个抽象方法
    abstract double apply (double x, double y);

    public static final void main(String[] args) {

        System.out.print(Operation2.DIVIDE.apply(111,222));
    }
}
