package com.xyz.design_pattern.chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/3/14
 * Time: 10:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.println("跨库");

    }


    public static final void main(String[] args) {

        Person cx = new Person("小菜");
        Finery dtx = new TShirts();
        Finery kk = new BigTrouser();
        Finery pqx = new Sneekers();
        dtx.show();
        kk.show();
        pqx.show();
        cx.show();

        //这比较恶心，一条一条的写

        Finery xz = new Suit();
        Finery ld = new Tie();
        Finery px = new LeatherShoes();
        xz.show();
        ld.show();
        px.show();
        cx.show();

    }
}
