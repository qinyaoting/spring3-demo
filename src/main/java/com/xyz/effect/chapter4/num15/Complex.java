package com.xyz.effect.chapter4.num15;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */

// 复数是指能写成如下形式的数a+bi,这里a和b是实数，i是虚数单位(即-1开根)。在复数a+bi中，a称为复数的实部，b称为复数的虚部，i称为虚数单位
public class Complex {

    private final double re;    //私有final的
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

    public Complex subtract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex multiply(Complex c) {

        return new Complex(re * c.re - im * c.im,
                re * c.im + im * c.re);
    }

    public Complex divide(Complex c) {

        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re*c.re+im*c.im)/tmp,
        (im*c.re - re * c.im)/tmp);
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        Complex c = (Complex)o;
        return Double.compare(re,c.re) == 0 &&
                Double.compare(im, c.im) == 0;
    }

    public int hashCode() {
        int result = 17 + hashDouble(re);
        result = 31 * result + hashDouble(im);
        return result;
    }

    public int hashDouble(double val) {

        long longBits = Double.doubleToLongBits(re);
        return (int)(longBits ^ (longBits >>> 32));
    }

    public String toString() {
        return re + " " + im + "";
    }



}
