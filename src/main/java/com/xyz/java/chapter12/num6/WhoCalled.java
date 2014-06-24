package com.xyz.java.chapter12.num6;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/24/14
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }
    static void g(){f();}
    static void h(){g();}

    public static void main(String[] args) {
        f();
        System.out.println("---------");
        g();
        System.out.println("---------");
        h();
    }
}
