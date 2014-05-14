package com.xyz.design_pattern.chapter16.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class AfternoonState extends State {
    @Override
    public void writeProgress(Work w) {
        if (w.getHour() < 17) {
            System.out.println("当前时间" + w.getHour() + "下午状态不错，继续努力");
        } else {
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
