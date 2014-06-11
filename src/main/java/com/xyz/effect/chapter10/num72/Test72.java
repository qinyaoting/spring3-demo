package com.xyz.effect.chapter10.num72;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test72 {

    //不要依赖线程调度器，否则程序既不健壮也不具有可移植性
    //不要依赖Thread.yield或者线程优先级
    //确保可运行的线程平均数量不明显多于处理器的数量

    //线程不应该一直处于忙-等的状态，即反复的检查一个共享对象，一等待某个些事情发生
    // 忙-等极大增加处理器的负担，降低了同一机器上其他进程可以完成的有用的工作量'

    //如果一个程序不能工作，因为某些线程无法获得足够的cpu时间，不要其他通过Thread.yield()来修正该程序，
    // 线程优先级最不可移植

    //Thread.yield();唯一用途是在测试期间人为增加出现的并发性
}
