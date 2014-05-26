package com.xyz.design_pattern.chapter27;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/26/14
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    //解释器模式：interpreter

    public static final void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();

        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression exp:list) {
            exp.interpret(context);
        }
    }

    //用了解释器模式，就意味着可以很容易的改变和扩展文法，因为该模式使用类来表示文法规则
    //你可使用继承来改变或扩展该文法
}
