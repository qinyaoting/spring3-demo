package com.xyz.java.chapter12.num6;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/24/14
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionMethods {

    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getMessage():" + e.getMessage());
            System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.out.println("toString():" + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);

            // 每一个方法比前一个提供了更多的信息，每一个都是前一个的超集
        }
    }
}
