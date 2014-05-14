package com.xyz.design_pattern.chapter16.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class EveningState extends State {
    @Override
    public void writeProgress(Work w) {

        if (w.isFinish()) {
            w.setState(new RestState());
            w.writeProgram();
        } else {
            if (w.getHour() < 21) {
                System.out.println("当前时间" + w.getHour() + "工作没完成，加班，疲劳之际");
            } else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }

    }
}
