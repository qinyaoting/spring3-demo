package com.xyz.java.chapter12.num4;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/24/14
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class FullConstructors {

    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            //e.printStackTrace(System.out);
            e.printStackTrace();
        }
    }
}
