package com.baobaotao.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/22/14
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class PerformanceMonitor {

    private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();

    public static void begin(String method) {
        System.out.println("begin monitor...");
        MethodPerformance mp = new MethodPerformance(method);
        performanceRecord.set(mp);
    }

    public static void end() {
        System.out.println("end monitor...");
        MethodPerformance mp = performanceRecord.get();

        mp.printPerformance();
    }
}
