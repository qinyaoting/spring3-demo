package com.xyz.effect.chapter4.num18;

import java.util.AbstractList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/26/14
 * Time: 9:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test18 {

    //18接口由于抽象类

    // 现有的类可以很容易的更新，以实现新的接口

    // 接口是定义混合类型的理想选择



    //接口允许我们构造非层次结构的类型架构



    static List<Integer> intArrayAsList(final int[] a) {

        if (a==null)
            throw new NullPointerException();

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int i) {
                return a[i];  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            public int size() {
                return a.length;  //To change body of implemented methods use File | Settings | File Templates.
            }

            public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val;
                return oldVal;
            }
        };
    }

}
