package com.xyz.design_pattern.chapter24.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {

        // 20到30 处理该请求
        if (request >=20 && request < 30) {
            System.out.println(this.getClass().getName() + " 来处理 " + request);
        }

        // 转移到下一位
        else if (successor != null) {
            successor.handleRequest(request);
        }
    }


    public static final void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2,5,14,22,18,3,27,20};
        for (int i : requests) {
            h1.handleRequest(i);
        }

        // 职责链的好处
        // 当客户提交一个请求时，请求是沿着链传递直到一个ConcreteHandler对象负责处理它
    }
}
