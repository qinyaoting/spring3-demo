package com.xyz.design_pattern.chapter16.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class Work {

    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    private boolean finish;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Work() {
        // 初始化，第一个执行
        this.state = new ForenoonState();
    }

    public void writeProgram() {
        state.writeProgress(this);
    }

}
