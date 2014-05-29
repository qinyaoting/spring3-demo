package com.xyz.effect.chapter6.num30;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/27/14
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeightTable {

    public static final void main(String[] args) {
        double earthWeight = Double.parseDouble("11111");
        double mass = earthWeight / Plant.EARTH.surfaceGravity();
        // values 返回
        for (Plant p : Plant.values())
            System.out.printf("Weight on %s is %f%n",p,p.surfaceWeight(mass));
        // printf
    }

    // 顶层类
    // 成员类
}
