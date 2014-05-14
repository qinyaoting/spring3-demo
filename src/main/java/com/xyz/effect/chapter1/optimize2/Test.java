package com.xyz.effect.chapter1.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 避免创建不必要的对象
    // String s = new String("stringgette"); 千万别这么做，这回创建许多对象

    String s = "stringgette";


    //=====================================================
    public static void main(String[] args) {
        Long sum = 0L;
        for(long i=0;i<Integer.MAX_VALUE;i++) {
            sum += i;
        }
        System.out.println(sum);

        // Long sum -> long sum 效率提升
        // 优先使用基本类型而不是装箱基本类型，当心无意识的自动装箱
    }

}
