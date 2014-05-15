package com.xyz.effect.chapter3;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 6:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
       /*if (!(o instanceof ColorPoint))
           return false;
        return super.equals(o) && ((ColorPoint)o).color == color;*/
        //======================================================

        /*if (!(o instanceof Point))
            return false;
        if (!(o instanceof ColorPoint))
            return o.equals(this);
        return super.equals(o) && ((ColorPoint)o).color == color;
        //======================================================*/

        if (o == null || o.getClass() != getClass())
            return false;
        Point p = (Point)o;
        return false;//p.x == x && p.y == y;

        //======================================================
    }


}
