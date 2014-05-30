package com.xyz.design_pattern.chapter2.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class CashContext0 {

    private CashSuper cs;

    public CashContext0(CashSuper cs) {
        this.cs = cs;
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }









    public static final void main(String[] args) {

        CashContext0 cc = null;
        int type = 1;
        switch (type) {
            case 1:     //正常收费
                cc = new CashContext0(new CashNormal());
                break;
            case 2:     //满300减100
                cc = new CashContext0(new CashReturn(300,100));;
                break;
            case 3:     //打8折
                cc = new CashContext0(new CashRebate(0.8));;;
                break;
        }
        cc.getResult(111);
    }
}
