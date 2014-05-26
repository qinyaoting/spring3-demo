package com.xyz.design_pattern.chapter27;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/26/14
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class NonterminalExpression extends AbstractExpression {



    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
