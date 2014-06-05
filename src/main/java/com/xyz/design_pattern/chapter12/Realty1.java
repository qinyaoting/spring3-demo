package com.xyz.design_pattern.chapter12;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/4/14
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Realty1 {

    public void sell() {
        System.out.print("房地产1卖出...");
    }

    public void buy() {
        System.out.print("房地产1买入...");
    }



    public static final void main(String[] args) {

        Stock1 gu1 = new Stock1();
        Stock2 gu2 = new Stock2();
        Stock3 gu3 = new Stock3();
        NationalDebt1 nd1 = new NationalDebt1();
        Realty1 rt1 = new Realty1();

        gu1.buy();
        gu2.buy();
        gu2.buy();

        nd1.buy();
        rt1.buy();

        gu1.sell();
        gu2.sell();
        gu3.sell();
        nd1.sell();
        rt1.sell();
    }
}
