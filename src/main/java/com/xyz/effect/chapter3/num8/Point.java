package com.xyz.effect.chapter3.num8;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        if (y != point.y) return false;

        return true;*/

        if (!(o instanceof Point))
            return false;
            Point p = (Point)o;
            return p.x == x && p.y == y;
    }


}
