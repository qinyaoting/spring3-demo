package com.xyz.design_pattern.chapter8.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/3/14
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleFactory {

    public static LeiFeng createLeiFeng(int type) {

        LeiFeng result = null;

        switch (type) {
            case 1:
                result = new Undergraduate();
                break;
            case 2:
                result = new Volunteer();
                break;
        }
        return result;
    }



    public static final void main(String[] args) {

        LeiFeng studentA = SimpleFactory.createLeiFeng(1);
        studentA.buyRice();

        LeiFeng studentB = SimpleFactory.createLeiFeng(1);
        studentB.sweep();

        LeiFeng studentC = SimpleFactory.createLeiFeng(1);
        studentC.wash();



    }
}
