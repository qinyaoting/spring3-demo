package com.xyz.design_pattern.chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class OperationFactory {

    enum Operate{ADD, SUB, MUL, DIV};

    public static Operation createOperate(Operate op) {
        Operation oper = null;
        switch (op) {
            case ADD:
                oper = new OperationAdd();
            break;
            case SUB:
                oper = new OperationSub();
                break;
            case MUL:
                oper = new OperationMul();
                break;
            case DIV:
                oper = new OperationDiv();
                break;
        }
        return oper;
    }

    public static final void main(String[] args) {
        Operation op = OperationFactory.createOperate(Operate.ADD);
        op.setNumberA(111);
        op.setNumberB(222);
        double result = op.getResult();
        System.out.println(result);

        Operation op2 = OperationFactory.createOperate(Operate.SUB);
        op2.setNumberA(111);
        op2.setNumberB(222);
        double result2 = op2.getResult();
        System.out.println(result2);
    }
}
