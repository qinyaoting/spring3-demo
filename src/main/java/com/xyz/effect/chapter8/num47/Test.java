package com.xyz.effect.chapter8.num47;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    //了解和使用类库


    //产生一个位于0和某个上界之间的随机数

    private static final Random rnd = new Random();


    static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }

    //以上方法有三个缺点
    // nextInt(int) 用这个代替
}
