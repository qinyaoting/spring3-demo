package com.xyz.design_pattern.chapter10.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestPapterB extends TestPaper {

    @Override
    protected String answer1() {
        return "a";    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    protected String answer2() {
        return "a";    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    protected String answer3() {
        return "a";    //To change body of overridden methods use File | Settings | File Templates.
    }


    public static final void main(String[] args) {

        TestPaper studentA = new TestPapterA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        TestPaper studentB = new TestPapterB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();

        //模板方法，定义一个操作中的算法的骨架，而将一些步骤延迟到子类中
        // 模板方法也使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤.
    }
}
