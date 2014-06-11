package com.xyz.structure.chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/11/14
 * Time: 3:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 算法时间复杂度
    // 在进行算法分析时，语句总的执行次数T(n)是关于问题规模n的函数，进而分析T(n) 随n的变化情况并确定T(n)的数量
    // 算法的时间复杂度，也就是算法的时间亮度，记作 T(n)=O(f(n))
    // 他表示随问题规模n的增大，算法执行时间的曾长率和f(n)的增长率相同，称作算法的渐进时间复杂度，简称时间复杂度
    //
    // O(n) O(1) O(n^2)常数阶 线性阶 平方阶，

    public static final void main(String[] args) {

        //计算1+2+3....+100
        //第1种算法

        int n = 100;
        int sum = 0;                         //执行1次
        for(int i=1;i<=n;i++) {            //执行n+1次
            sum += i;                        //执行n次
        }
        System.out.printf("%d%n", sum);      //执行1次

        //第二种算法
        sum = 0;                             //执行1次
        sum = (1+n) * n/2;                   //执行1次
        System.out.printf("%d%n", sum);      //执行1次

        sum = 0;
        int x=0;
        int i,j=0;
        for(i=1;i<=n;i++) {
            for(j=1;j<=n;j++) {
                x++;                          //执行n*n次
                sum += x;
            }
        }
        System.out.printf("%d%n", sum);      //执行1次
    }



}
