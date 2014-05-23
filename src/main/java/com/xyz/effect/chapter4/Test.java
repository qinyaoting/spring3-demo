package com.xyz.effect.chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 13 使类和成员的可访问性最小化

    // 对于顶层类或接口，只有两种访问级别：包级私有(package-private)和共有的(public)

    // 如果一个包级私有的顶层类，只是在某一个类的内部被用到，那就应该改为嵌套类


    // 长度非零的数组是可变的，所以，类包含共有静态final数组，或者返回这种域的访问方法，几乎是错误的

    public static final void main(String[] args) {

    }

    // public static final Thing[] VALUES = {...};

    // 方法1：增加一个共有的不可变的列表
    private static final Thing[] PRIVATE_VALUES = {null,null};
    public static final List<Thing> VALUES =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    // 方法2：共有方法，返回他的一个备份
    //private static final Thing[] PRIVATE_VALUES = {null,null};
    public static final Thing[] values () {
        return PRIVATE_VALUES.clone();
    }
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
