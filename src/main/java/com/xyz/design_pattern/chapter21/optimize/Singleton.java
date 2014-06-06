package com.xyz.design_pattern.chapter21.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 4:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {

    private static Singleton instance;
    private static Object syncRoot = new Object();
    private Singleton() {}

    public static Singleton getInstance() {

        synchronized (syncRoot) {
            if (instance == null)
                instance = new Singleton();
        }
        return instance;
    }


    // 双重锁定
    public static Singleton getInstance2() {
        if (instance == null){
            synchronized (syncRoot) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
