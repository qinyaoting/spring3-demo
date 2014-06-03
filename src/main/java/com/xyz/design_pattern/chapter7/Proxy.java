package com.xyz.design_pattern.chapter7;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Proxy {

    SchlloGirl mm;

    public Proxy(SchlloGirl mm) {
        this.mm = mm;
    }

    public void giveDolls() {
        System.out.println(mm.getName() + "，送你娃娃");
    }

    public void giveFlowers() {
        System.out.println(mm.getName() + "，送你花");
    }

    public void giveChocolate() {
        System.out.println(mm.getName() + "，送你巧克力");
    }



    public static final void main(String[] args) {
        SchlloGirl jiaojiao = new SchlloGirl();

        jiaojiao.setName("娇娇");
        Proxy daili = new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
