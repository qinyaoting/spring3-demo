package com.xyz.effect.chapter6.num34;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */

//Emulated extensible enum using an inteface

public enum BasicOperation implements Operation {
    PLUS("+") {
        public double apply(double x, double y) {return x+y;}
    },
    MINUS("-") {
        public double apply(double x, double y) {return x+y;}
    },
    TIMES("*") {
        public double apply(double x, double y) {return x+y;}
    },
    DIVIDE("/") {
        public double apply(double x, double y) {return x+y;}
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

}
