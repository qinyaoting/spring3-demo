package com.xyz.design_pattern.chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class OperationFactory {

    public static Operation createOperate(int operate) {
        Operation oper = null;
        switch (operate) {
            case 1:
                oper = new OperationAdd();
            break;
            case 2:
                oper = new OperationSub();
                break;
            case 3:
                oper = new OperationMul();
                break;
            case 4:
                oper = new OperationDiv();
                break;
        }
        return oper;
    }

    public static final void main(String[] args) {
        Operation op = OperationFactory.createOperate(1);
        op.setNumberA(111);
        op.setNumberB(222);
        double result = op.getResult();
        System.out.println(result);

        Operation op2 = OperationFactory.createOperate(2);
        op2.setNumberA(111);
        op2.setNumberB(222);
        double result2 = op2.getResult();
        System.out.println(result2);
    }
}
