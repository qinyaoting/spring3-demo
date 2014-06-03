package com.xyz.effect.chapter7.num38;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test38 {

    //检查参数的有效性

    //Javadoc @throws

    /**
     * Return a BigInteger whose value is(this mod m).This method
     * differs from the remainder method in that it always returns a
     * non-negative BigInteger
     * @param m the modulus, which must be positive
     * @return ArithmeticException if m is less than or equal to 0
     */
    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0)
            throw new ArithmeticException("Modulus <= 0: " + m);

        return BigInteger.valueOf(11111);
    }


    private static void sort(long a[], int offset, int length) {

        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert  length >= 0 && length <= a.length -offset;

        //....

        //如果断言失败会抛出AssertionError
    }
}
