package com.xyz.effect.chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Complex {

    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart(){ return re;}
    public double imaginaryPart(){return im;}

    public Complex add (Complex c) {
        return new Complex(re + c.re, im + c.im);
    }
}
