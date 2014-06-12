package com.xyz.effect.chapter3.num8;

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


    // 如果不提供equals方法，直接从Point继承过来，equals做比较的时候颜色信息就被忽略了
    // 1
    @Override
    public boolean equals(Object o) {
       /*if (!(o instanceof ColorPoint))
           return false;
        return super.equals(o) && ((ColorPoint)o).color == color;

        Point p = new Point(1,2);
        ColorPoint cp = new ColorPoint(1,2,Color.RED);

        p.equals(cp) true    cp.equals(p) false 违反对称  */

        //======================================================

        /*if (!(o instanceof Point))
            return false;
        if (!(o instanceof ColorPoint))
            return o.equals(this);
        return super.equals(o) && ((ColorPoint)o).color == color;

        /*ColorPoint p1 = new ColorPoint(1,2,Color.RED);
        Point p2 = new Point(1,2);
        ColorPoint p3 = new ColorPoint(1,2,Color.BLUE);

        p1.equals(p2) 和  p2.equals(p3)  true  p1.equals(p3)  false*/
        //提供了对称性，牺牲了传递性

        //======================================================

        /*if (o == null || o.getClass() != getClass())
            return false;
        Point p = (Point)o; */
        return false;

        //======================================================
    }


}
