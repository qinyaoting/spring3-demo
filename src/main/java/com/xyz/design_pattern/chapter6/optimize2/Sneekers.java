package com.xyz.design_pattern.chapter6.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 11:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class Sneekers extends Finery {

    @Override
    public void show() {
        System.out.println("皮鞋");
        super.show();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public static final void main(String[] args) {

        Person cx = new Person("小菜");

        Sneekers pqx = new Sneekers();
        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();

        pqx.decorate(cx);
        kk.decorate(pqx);
        dtx .decorate(kk);
        dtx.show();

        Finery xz = new Suit();
        Finery ld = new Tie();
        Finery px = new LeatherShoes();
        xz.decorate(cx);
        ld.decorate(xz);
        px.decorate(ld);
        px.show();
    }
}
