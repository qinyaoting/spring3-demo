package com.xyz.design_pattern.chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class Operation {

    /*public static double getResult(double numberA, double numberB, String operate) {
        double resutl = 0d;;
        switch (operate) {
            case "+":
                resutl = numberA + numberB;
                break;
            case "-":
                resutl = numberA - numberB;
                break;
            case "*":
                resutl = numberA * numberB;
                break;
            case "/":
                resutl = numberA / numberB;
                break;
        }
        return resutl;
    }

    public static final void main(String args) {

    }*/

    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult() {
        double result = 0;
        return result;
    }
}
