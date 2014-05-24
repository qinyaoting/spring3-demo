package com.xyz.design_pattern.chapter24.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class Handler {

    protected Handler successor;

    // 设置继任者
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //处理请求的抽象方法
    public abstract void handleRequest(int request);
}
