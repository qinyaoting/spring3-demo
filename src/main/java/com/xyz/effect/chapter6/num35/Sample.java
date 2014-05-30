package com.xyz.effect.chapter6.num35;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sample {

    @Test
    public static void m1() {
        //Test should pass
    }

    public static void m2() {
        //Test should fail
    }
    @Test
    public static void m3() {
        throw new RuntimeException("Boom");
    }

    public static void m4() {

    }
    @Test
    public void m5() {
        //INVALID USE:nonstatic method
    }

    public static void m6() {

    }

    @Test
    public static void m7() {       //Test should fail
        throw new RuntimeException("Crash");
    }

    public static void m8(){

    }


}
