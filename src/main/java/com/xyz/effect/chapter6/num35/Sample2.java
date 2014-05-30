package com.xyz.effect.chapter6.num35;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sample2 {

    @ExceptionTest(ArithmeticException.class)

    public static void m1() {
        int i=0;
        i = i/i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        int[] a = new int[0];
        int i=a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() {
    }


}
