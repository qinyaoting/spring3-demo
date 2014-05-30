package com.xyz.effect.chapter6.num35;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/30/14
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */



    //注解优先于命名模式

/**
 * Indicates that the annotated method is a test method
 * Use only on parameterless static methods
  */

@Retention(RetentionPolicy.RUNTIME)  //Test注解应该在运行时保留，如果没有保留，测试工具就无法知道Test注解
@Target(ElementType.METHOD)     //只在方法声明中才是合法的：他不能运用到类声明、域声明或者其他程序元素上
public @interface Test {


}
