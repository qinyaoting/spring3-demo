package com.xyz.design_pattern.chapter10.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestPaper {

    public void testQuestion1() {

        System.out.printf("问题1：xx 请选择 A B C D%n");
        System.out.printf("答案：" + answer1() + "%n");
    }

    public void testQuestion2() {

        System.out.printf("问题2：yyyy 请选择 A B C D%n");
        System.out.printf("答案：" + answer2() + "%n");
    }

    public void testQuestion3() {

        System.out.printf("问题3：zzzzzz 请选择 A B C D%n");
        System.out.printf("答案：" + answer3() + "%n");
    }

    protected String answer1() {

        return "";
    }

    protected String answer2() {

        return "";
    }

    protected String answer3() {

        return "";
    }
}
