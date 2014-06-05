package com.xyz.effect.chapter7.num42;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 5:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 慎用可变参数

    static int sum(int... args) {
        int sum = 0;
        for (int arg: args)
            sum += arg;

        return sum;
    }


    static int min(int... args) {
        if(args.length == 0) {
            throw new IllegalArgumentException("Too few arguments");
        }
        int min = args[0];
        for(int i=1;i<args.length;i++)
            if (args[i] < min)
                min = args[i];
        return min;
    }


    static int min2(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for(int arg  : remainingArgs) {
            if (arg<min)
                min = arg;
        }
        return min;
    }

    public static final void main(String[] args) {

        List<String> homophones = Arrays.asList("to", "too", "two");

        int[] digits = {3,1,4,1,5,9,2,6,5,4};
        System.out.print(Arrays.toString(digits));
    }
}
