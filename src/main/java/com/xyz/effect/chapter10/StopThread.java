package com.xyz.effect.chapter10;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */

//Broken! How long would you expect this program to run?
public class StopThread {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException{

        Thread backgroundThread = new Thread(
                new Runnable(){

                    @Override
                    public void run() {
                        int i=0;
                        while (!stopRequested)
                            i++;
                    }
                }
        );
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;

    }

    //你可能期望这个程序运行大约1秒，之后主线程将stopRequested设置为true
    //致使后台现场的循环终止，但是这个程序永远不会终止
    //问题在于，由于没有同步，就不能保证后台线程何时 看到 主线程对stopRequested的改变，


    //====修正后的方法
    // requestStop和stopRequested都加同步了，只同步写方法，是不行的
    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested(){
        return stopRequested;
    }


    public static void main2(String[] args) throws InterruptedException{

        Thread backgroundThread = new Thread(
                new Runnable(){

                    @Override
                    public void run() {
                        int i=0;
                        while (!stopRequested())
                            i++;
                    }
                }
        );
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        requestStop();

    }


    //====  volatile ['vɔlətail] 挥发性的；不稳定的；爆炸性的；反覆无常的
    //volatile修饰符不执行互斥访问，但他可以保证任何一个线程在读取该域的时候将看到最近刚刚被写入的值

    private static volatile boolean stopRequested3;

    public static void main3(String[] args) throws InterruptedException{

        Thread backgroundThread = new Thread(
                new Runnable(){

                    @Override
                    public void run() {
                        int i=0;
                        while (!stopRequested3)
                            i++;
                    }
                }
        );
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;

    }

    //====volatile使用时，务必小心，以下例子有问题

    private static volatile int nextSeriaNumber = 0;

    public static int generateSerialNumber() {
        return nextSeriaNumber++;   //多个线程执行，这里会有问题
    }

    //====

    private static int nextSeriaNumber2 = 0;

    public static synchronized int generateSerialNumber2() {
        return nextSeriaNumber++;
    }

    private static final AtomicLong nextSerialNum = new AtomicLong();
    public static long generateSerialNumber3() {
     return nextSerialNum.getAndIncrement();
    }
}
