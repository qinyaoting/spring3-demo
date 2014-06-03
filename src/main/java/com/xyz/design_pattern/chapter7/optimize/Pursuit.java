package com.xyz.design_pattern.chapter7.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 2:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pursuit implements GiveGift {

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "，送你娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "，送你花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "，送你巧克力");
    }
}
