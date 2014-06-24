package com.xyz.java.chapter12.num4;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/24/14
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class InheritingException {

    public void f() throws SimpleException {
        System.out.println("Throw simpleExcpetion form f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingException sed = new InheritingException();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}
