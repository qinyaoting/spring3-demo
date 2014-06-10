package com.xyz.effect.chapter10.num68;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test68 {

    // 68executor和task优先与线程
    ExecutorService executor = Executors.newSingleThreadExecutor();
    //executor.execute();
    //executor.shutdown();



    // 如果是小程序，或者是轻载的服务器，使用 Executors.newCachedThreadPool();
    // 它不需要配置，，

    //在大负载的产品服务器中，最好使用 Executors.newFixedThreadPool(111);

    //应该尽量不要编写自己的工作队列，而且还应该尽量不直接使用线程
}
