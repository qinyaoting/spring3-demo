package com.xyz.design_pattern.chapter16.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class ForenoonState extends State {
    @Override
    public void writeProgress(Work w) {
        if (w.getHour() < 12) {
            System.out.println("当前时间" + w.getHour() + "上午工作，精神百倍");
        } else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
