package com.xyz.effect.chapter4.num20;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/26/14
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */
/*class Figure {  //[ˈfiɡə]              数字；算术；图解；轮廓 vt 数字；算术；图解；轮廓

    //类层次优于标签类
    // 表示圆形或矩形

    enum Shape{RECTANGLE, CIRCLE};

    final Shape shape;

    double length;
    double width;

    double redius;

    Figure(double redius)
    {
        shape = Shape.CIRCLE;
        this.redius = redius;
    }

    Figure(double length, double width)
    {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area()
    {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI*(redius*redius);
            default:
                throw new AssertionError();
        }
    }


    //标签类过于冗长，容易出错，效率低下
}*/

abstract class Figure{

    abstract double area();

}

class Circle extends Figure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area(){
        return Math.PI*(radius*radius);
    }
}

class Rectangle extends Figure {
    final double length;
    final double width;

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    double area(){
        return length*width;
    }
}

//这个类层次纠正了前面便签类的缺点

class Square extends Rectangle {
    Square(double side){
        super(side,side);
    }
}
