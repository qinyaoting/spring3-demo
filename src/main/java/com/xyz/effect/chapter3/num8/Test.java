package com.xyz.effect.chapter3.num8;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/12/14
 * Time: 12:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 覆盖equals时，请遵守通用约定


    // 什么时候该覆盖Object.equals方法那？
    // 如果类具有自己特有的路基相等概念，而且超类还没有覆盖equals以实现期望的行为，这
    // 我们就覆盖equals方法，这通常属于值类的情形 ，不是了解他们是否指向同一个对象

    // 枚举类 逻辑相同与对象等同是一回事

    // 覆盖equals需要遵守通用约定
    // 自反性 对称性 传递性 一致性


    public static final void main(String[] args) {


        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        //违反了对称性
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }

    // 当编写完equals方法后，应该问自己三个问题：他是否对称的，传递的，一致的
    // 覆盖equals时总要覆盖hashCode
    // 不要其他让equals方法过于智能
    // 1



}
