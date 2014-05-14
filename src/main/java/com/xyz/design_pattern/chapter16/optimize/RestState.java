package com.xyz.design_pattern.chapter16.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class RestState extends State {
    @Override
    public void writeProgress(Work w) {
        System.out.println("当前时间" + w.getHour() + "下班回家了");
    }
}
