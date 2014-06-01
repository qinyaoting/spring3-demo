package com.xyz.design_pattern.chapter27.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/1/14
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Scale extends Expression {
    @Override
    public void excute(String key, double value) {

        String scale = "";
        int val = (int) value;
        switch (val) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;

        }

        System.out.print(scale);
    }

    public static final void main(String[] args) {


        PlayContext context = new PlayContext();
        context.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 G ");
        Expression expression = null;
        try {
            while (context.playText().length() > 0) {
                String str = context.playText().substring(0,1);
                /*switch (str) {
                    case "O":
                        expression = new Scale();
                        break;
                    case "C":

                    case "T":
                        expression = new Speed();
                        break;

                    case "P":
                        expression = new Note();
                        break;


                }*/
                expression.interpret(context);
            }
        }catch (Exception e) {

        }
    }
}
