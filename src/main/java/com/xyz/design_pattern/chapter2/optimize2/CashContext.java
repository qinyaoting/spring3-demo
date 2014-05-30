package com.xyz.design_pattern.chapter2.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(int type) {
        switch (type) {
            case 1:     //正常收费
                cs = new CashNormal();
                break;
            case 2:     //满300减100
                cs = new CashReturn(300,100);;
                break;
            case 3:     //打8折
                cs = new CashRebate(0.8);;;
                break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }







    public static final void main(String[] args) {

        // 1 正常收费 2 满300减100 3 打8折
        CashContext cc = new CashContext(1);
        cc.getResult(111);

        //客户端只需要认识 CashContext 一个类 ，降低耦合

        CashSuper cashSuper = CashFactory.createCashAccept(1);
        cashSuper.acceptCash(111);

        //用工厂方法，客户端只需要认识 CashFactory  CashSuper两个类
    }
}
