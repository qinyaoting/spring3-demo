package com.xyz.effect.chapter4.num14;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/13/14
 * Time: 10:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 在共有类中使用访问方法而非共有域


}

class Point {
    // public double x;
    // public double y;

    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
