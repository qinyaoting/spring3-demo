package com.xyz.design_pattern.chapter2.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {

        double result = money;
        if (money >= moneyCondition)
            result = money - Math.floor(money/moneyCondition) * moneyReturn;
        return result;

    }
}
