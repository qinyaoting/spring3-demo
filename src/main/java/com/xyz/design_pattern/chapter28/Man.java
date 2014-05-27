package com.xyz.design_pattern.chapter28;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class Man extends Person {


    @Override
    public void getConclusion() {
        if (action.equals("成功")) {
            System.out.println(this.getClass().getName() + " " + action + " ，背后多半有一个伟大的女人");
        } else if (action.equals("失败")) {
            System.out.println(this.getClass().getName() + " " + action + " ，闷头喝酒，谁也不用劝");
        } else if (action.equals("恋爱")) {
            System.out.println(this.getClass().getName() + " " + action + " ，凡是不懂也要装懂");
        }
    }
}
