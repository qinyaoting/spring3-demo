package com.xyz.effect.chapter2.num5;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/12/14
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 5 避免创建不必要的对象
    // String s = new String("stringgette"); 千万别这么做，这回创建许多对象

    String s = "stringgette";   //同一台虚拟机中，重用不可变对象

    //=====================================================

    // 使用静态工厂方法，而不使用构造器，避免创建不必要的对象
    // Boolean.valueOf(String) Boolean(String) 使用前者

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
