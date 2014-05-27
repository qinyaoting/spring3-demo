package com.xyz.effect.chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/27/14
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test30 {

    //30 用enum代替int常量

    //没有引入枚举前，表示一组常量int

    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;


    public enum Apple {FUJI, PIPPIN,GRANNY_SMITH}
    public enum Orangle {NAVEL, TEMPLE,BLOOD}
}
