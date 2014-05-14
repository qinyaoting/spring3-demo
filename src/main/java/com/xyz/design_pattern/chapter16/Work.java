package com.xyz.design_pattern.chapter16;

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

    public void writeProgram() {
        if (hour < 12) {
            System.out.println("当前时间" + hour + "上午工作，精神百倍");
        } else if (hour <13) {
            System.out.println("当前时间" + hour + "饿了，午饭， 犯困，午休");
        } else if (hour <17) {
            System.out.println("当前时间" + hour + "下午状态不错，继续努力");
        } else {
            if (finish) {
                System.out.println("当前时间" + hour + "下班回家");
            } else {
                if (hour < 21) {
                    System.out.println("当前时间" + hour + "工作没完成，加班，疲劳之际");
                } else {
                    System.out.println("当前时间" + hour + "工作没完成，不行了，睡着了");
                }
            }
        }
    }

    //==========================================================
    // 问题：方法很长，而且有许多判断分支，意味着责任过大了
    // 面向对象设计就是希望做到代码的责任分解，

    //==========================================================
    // 状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了类
    // 主要解决的是当控制一个对象状态转换的条件表达过于复杂时的情况，把状态的判断逻辑转移到表示不同状态的一系列类当中
}
