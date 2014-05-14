package com.xyz.design_pattern.chapter16.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class NoonState extends State {
    @Override
    public void writeProgress(Work w) {
        if (w.getHour() < 13) {
            System.out.println("当前时间" + w.getHour() + "饿了，午饭， 犯困，午休");
        } else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
