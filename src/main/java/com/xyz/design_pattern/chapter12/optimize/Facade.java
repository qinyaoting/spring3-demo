package com.xyz.design_pattern.chapter12.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/4/14
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Facade {

    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {

        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {

        one.methodOne();
        two.methodOne();
        four.methodOne();
    }

    public void methodB() {
        two.methodOne();
        three.methodOne();
    }

    public static void main(String [] args) {

        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
