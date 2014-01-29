package com.baobaotao.junit;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 7:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class MoneyBag {

    private Money moneyBag[];

    public MoneyBag() {
    }

    public MoneyBag(Money[] moneyBag) {
        this.moneyBag = moneyBag;
    }

    public Money[] getMoneyBag() {
        return moneyBag;
    }

    public void setMoneyBag(Money[] moneyBag) {
        this.moneyBag = moneyBag;
    }
}
