package com.xyz.effect.chapter10.num70;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test70 {

    //线程安全性的文档化
    // 当一个类的实例或静态方法被并发使用时，这个类的行为如何，是该类与客户端程序建立约定的重要组成部分


    // 线程安全性的几种级别

    // 不可变的             这个类的实例是不变的，所以不需要外部的同步 String Long BigInteger
    // 无条件的线程安全      这个类的实例是可变的，但这个类有足够的内部同步，所以他的实例可以被并发使用，无需外部同步 Random ConcurrentHashMap
    // 有条件的线程安全      除了有些方法进行安全的并发使用，需要同步之外，这个线程安全级别与无条件的线程安全相同 Collections.synchronized包装返回的集合，他们的迭代器要求外部同步
    // 非线程安全}          这个类的实例是可变的，客户端必须必须自己选择外部同步包围每个方法调用 ArrayList HashMap
    // 线程对立

}