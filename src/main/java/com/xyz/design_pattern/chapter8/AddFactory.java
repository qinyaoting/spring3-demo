package com.xyz.design_pattern.chapter8;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/3/14
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }




    public static final void main(String[] args) {

        IFactory operFactory = new AddFactory();
        Operation op = operFactory.createOperation();
        op.setNumberA(111);
        op.setNumberB(222);

        op.getResult();
    }
}
