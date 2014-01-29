package com.baobaotao.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/22/14
 * Time: 10:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class MethodPerformance {

    private long begin;
    private long end;

    private String serviceMethod;

    public MethodPerformance(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance() {
        end = System.currentTimeMillis();
        long elapse = end - begin;

        System.out.println(serviceMethod + "spend" + elapse + "millis");
    }
}
