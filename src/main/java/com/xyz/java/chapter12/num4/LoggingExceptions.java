package com.xyz.java.chapter12.num4;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/24/14
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoggingExceptions{


    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.out.println("Caught " + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.out.println("Caught " + e);
        }
    }
}
