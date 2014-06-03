package com.xyz.design_pattern.chapter7.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 2:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Proxy implements GiveGift {       //实现接口

   Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }


    public static final void main(String[] args) {

        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("娇娇");
        Proxy daili = new Proxy(jiaojiao);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
