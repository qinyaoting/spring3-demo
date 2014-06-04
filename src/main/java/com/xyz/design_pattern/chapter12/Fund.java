package com.xyz.design_pattern.chapter12;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/4/14
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fund {

    Stock1 gu1;
    Stock2 gu2;
    Stock3 gu3;

    NationalDebt1 nd1;
    Realty1 rt1;

    public Fund() {
        gu1 = new Stock1();
        gu2 = new Stock2();
        gu3 = new Stock3();
        nd1 = new NationalDebt1();
        rt1 = new Realty1();
    }

    public void buyFund() {

        gu1.buy();
        gu2.buy();
        gu3.buy();
        nd1.buy();
        rt1.buy();
    }

    public void sellFund() {
        gu1.sell();
        gu2.sell();
        gu3.sell();
        nd1.sell();
        rt1.sell();
    }

    public static void main(String[] args) {

        Fund jijin = new Fund();
        jijin.buyFund();     //用户不需要了解股票类
        jijin.sellFund();
    }
}
