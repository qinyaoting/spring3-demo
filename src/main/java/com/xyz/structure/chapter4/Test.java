package com.xyz.structure.chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/12/14
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 4.2.1 栈的定义 Stack 限定在表尾进行插入和删除操作的线性表

    // LIFO (Last In First Out)

    //4.2.2 进栈出栈变化形式

    // 4.3 栈的抽象数据类型

    // 4.4.1 栈的顺序存储结构



/*typedef int SElemType;

typedef struct {
        SElemType data[MAXSIZE];
        int top;
} SqlStack;*/

    // 4.4.2 栈的顺序存储结构 - 进栈
    // 4.4.2 栈的顺序存储结构 - 出栈
    // 4.5 两栈共享
    // 4.6.1 栈的链式存储结构
    // 4.6.2 栈的链式存储结构 - 进栈
    // 4.6.3 栈的链式存储结构 - 出栈
    // 4.7 栈的应用
    // 4.8 栈的应用 - 递归
    // 4.8.1  斐波那契数列

    public int fbi(int i) {
        if(i<2) {
            return i==0?0:1;

        }
        return fbi(i-1) + fbi(i-2);
    }



}