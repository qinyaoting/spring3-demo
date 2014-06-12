package com.xyz.effect.chapter3.num8;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/12/14
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class ColorPoint2 {

    //最优做法 不继承，采用复合
    private final Point point;
    private final Color color;

    public ColorPoint2(int x, int y, Point point, Color color) {
        if (color == null)
            throw new NullPointerException();
        this.point = new Point(x,y);
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof ColorPoint2))
            return false;
        ColorPoint2 cp = (ColorPoint2) obj;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
