package com.xyz.design_pattern.chapter27.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/1/14
 * Time: 8:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Speed extends Expression {
    @Override
    public void excute(String key, double value) {
        String speed;
        if (value < 500)
            speed = "快速";
        else if (value >= 1000)
            speed = "慢速";
        else
            speed = "中速";
        System.out.print(speed);
    }
}
