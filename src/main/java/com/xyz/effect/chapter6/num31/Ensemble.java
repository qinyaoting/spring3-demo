package com.xyz.effect.chapter6.num31;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/29/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */

// Abuse of ordinal to derive an associated value , don't do this
public enum  Ensemble {      // [ɑnˈsɑmb(ə)l]合奏

    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() {return ordinal() + 1;}

    //ordinal() 方法返回序列


    public static final void main(String[] args) {
        System.out.print(Ensemble.DECTET.numberOfMusicians());
    }
}
