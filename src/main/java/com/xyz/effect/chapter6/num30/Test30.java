package com.xyz.effect.chapter6.num30;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/27/14
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test30 {

    //30 用enum代替int常量

    //没有引入枚举前，常用声明一组具名int常量，如下

    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;

    //缺点：
    //  1 int枚举是编译时常量，被编译到使用他们的客户端中，如果枚举常量发生变化，客户端就必须重新编译
    //  2 打印出来就是一个数字，不能获得全部枚举的可靠方法


    public enum Apple {FUJI, PIPPIN, GRANNY_SMITH}
    public enum Orangle {NAVEL, TEMPLE, BLOOD}


    public static final void main(String[] args) {

        test(Apple.FUJI);
    }

    private static void test(Apple a) {
        System.out.print(a.toString());
    }

    // 枚举中可以添加方法和属性，可实现接口
}
