package com.xyz.design_pattern.chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 11:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class CashFactory {

    public static CashSuper createCashAccept(int type) {
        CashSuper cs = null;
        switch (type) {
            case 1:     //正常收费
                cs = new CashNormal();
                break;
            case 2:     //满300减100
                cs = new CashReturn(300,100);
                break;
            case 3:
                cs = new CashRebate(0.8);
                break;
        }
        return cs;

    }
}
