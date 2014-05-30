package com.xyz.effect.chapter6.num34;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */
public enum ExtendedOperation implements Operation {

    EXP ("^") {
        public double apply(double x, double y)
        {return Math.pow(x,y);}
    },
    REMAINDER ("%") {
        public double apply(double x, double y) {
            return x%y;
        }
    };

    private final String symbol;

    private ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }


    public static final void main(String[] args) {

        test(ExtendedOperation.class, 111, 222);
    }

    private static <T extends Enum<T> & Operation> void test(
            Class<T> opSet, double x, double y ) {

        for (Operation op : opSet.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n", x, op, y,op.apply(x,y));
        }
    }
}
