package com.xyz.effect.chapter11.num74;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test74 {

    // 序列化 serializing 将一个对象编码成一个字节流
    // 反序列化 deserializing

    // 一旦对象被序列号后，他的编码就可以从一台正在运行的虚拟机传递到另一台虚拟机上
    // 或被存储到磁盘上，供以后反序列化时使用
    // 序列化技术为远程通信提供了标准的线路级对象表示法
    // 也为JavaBeans组件结构提供了标准的持久化数据格式


    // 谨慎地实现Serializable接口，
    // 一旦一个类被发布，就大大降低了“改变这个类的实现“的灵活性

    // Date和BigInteger这样的值类应该实现Serializable
    // 大多数的集合类也应该如此
    // 代表活动实体的类（线程池）一般不应该实现Serializable
    // 为了继承而设计的类应该尽可能少的去实现Serializable，用户接口也少实现该接口.

}
