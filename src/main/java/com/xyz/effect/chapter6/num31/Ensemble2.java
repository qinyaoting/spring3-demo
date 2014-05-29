package com.xyz.effect.chapter6.num31;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/29/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Ensemble2 {      // [ɑnˈsɑmb(ə)l]合奏

    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
    SEXTET(6), SEPTET(7), OCTET(8), NONET(9), DECTET(10),
    //添加新的元素，比上一个类好
    TRIPLE_QUARTET(12);

    private final int numberOfMusicians;

    private Ensemble2(int size) {
        this.numberOfMusicians = size;
    }

    public int numberOfMusicians() {return numberOfMusicians;}


    public static final void main(String[] args) {
        Ensemble2.SOLO.numberOfMusicians();
    }
}
