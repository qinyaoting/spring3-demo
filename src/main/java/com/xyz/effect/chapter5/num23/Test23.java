package com.xyz.effect.chapter5.num23;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/27/14
 * Time: 8:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test23 {

    // 泛型  [dʒəˈnɛrɪk] generic adj.类的，属性的； 一般的； 不受商标保护的； [生]属的，类的

    List<String> list;

    //List<E> 相对应的原生态类型是List

    //请不要在新代码中使用原生态类型

    // 如果使用原生态类型，就失掉了泛型在安全性和表述性方面的所有优势

    // 无限制通配符类型
    // Set<E> 的无限制通配符是 Set<?> 不确定或不关心的类型参数

    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();
        unsaveAdd(strings, new Integer(42));
        String s = strings.get(0);
    }

    private static void unsaveAdd(List list, Object obj) {
        list.add(obj);
    }
}
