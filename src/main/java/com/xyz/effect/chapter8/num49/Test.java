package com.xyz.effect.chapter8.num49;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 2:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    //基本类型优先与装箱基本类型

    Comparator<Integer> natrualOrder = new Comparator<Integer>() {

        public int compare(Integer first, Integer second) {
            return first < second?-1:(first == second?0:1);  //To change body of implemented methods use File | Settings | File Templates.
        }
    };

    public final void main(String[] args) {

        natrualOrder.compare(new Integer(42),new Integer(42));
        // 1 错误



        Long sum = 0L;               //Long -> long
        for (long i=0;i<Integer.MAX_VALUE;i++) {
            sum += i;
        }

        System.out.print(sum);
    }

    //什么时候使用装箱基本类型那？集合



}
