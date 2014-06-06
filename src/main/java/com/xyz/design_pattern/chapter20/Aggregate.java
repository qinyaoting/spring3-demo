package com.xyz.design_pattern.chapter20;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */

// 聚集抽象类
abstract class Aggregate {  //[ˈæɡrɪɡɪt   n.合计；聚集体；骨料；集料


    // 创建迭代器
    public abstract Iterator createIterator();
}
