package com.xyz.design_pattern.chapter23.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    //将请求封装成一个对象，从而是你可以用不同的请求对客户端进行参数化；
    //对请求排队或记录请求日志，及支持可撤销操作

    public static final void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();
        i.setCommand(c);
        i.executeCommand();
    }

    //命令模式优点：
    //较容易设计一个命令队列
    //在需要的情况下，可以较容易的将命令记入日志
    //允许接受请求的一方决定是否要否决请求
    //容易实现对请求的撤销和重做
    //由于加进新的具体命令类不影响其他类，因此增加新类较容易
}
