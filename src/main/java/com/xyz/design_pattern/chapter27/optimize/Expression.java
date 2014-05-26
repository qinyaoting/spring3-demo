package com.xyz.design_pattern.chapter27.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/26/14
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Expression {

    public void interpret(PlayContext context) {
        if (context.playText().length() == 0) {
            return;
        } else {
            String playKey = context.playText().substring(0,1);
            context.setText(context.playText().substring(2));

            //double playValue = context.playText().substring()

        }
    }
}
