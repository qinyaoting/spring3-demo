package com.xyz.effect.chapter4.num15;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test15 {

    // 使可变性最小化
    // 使类成为不可变类，要遵循：
    // 1 不要提供任何会修改对象状态的方法
    // 2 保证类不会被扩展
    // 3 使所有的域都是final的
    // 4 使用所有的域都是私有的
    // 5 确保对于任何组建的互斥访问


    //不可变对象本质上市线程安全的，它们不需要同步

    // 对于频繁使用的值，为他们提供共有的静态final常量
    public static final Complex ZERO = new Complex(0,0);
    public static final Complex ONE = new Complex(1,0);
    public static final Complex I = new Complex(0,1);

    // 进一步扩展，不可变的类可以提供一些静态工厂，吧频繁请求的实例缓存起来,
}
