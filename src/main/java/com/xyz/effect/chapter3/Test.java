package com.xyz.effect.chapter3;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 6:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void  main(String[] args) {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1 ,2, Color.RED);


        System.out.println(p.equals(cp));
        System.out.println(cp.equals(p));
    }
}
