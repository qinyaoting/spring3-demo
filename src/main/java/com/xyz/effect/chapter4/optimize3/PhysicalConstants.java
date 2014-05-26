package com.xyz.effect.chapter4.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/26/14
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhysicalConstants {

    static final double AVOGADROS_NUMBRE = 6.02214199e23;

    static final double BOLTZMANN_CONSTANT = 1.3806503e-23;

    static final double ELECTRON_MASS = 9.10938188e-31;

    //常量接口模式是对接口的不良使用
    //实现常量接口，会导致把这样的实现细节泄漏到该类的导出API中


    //如果要导出常量，几种合理的方案
    //如果这些常量与某个现有的类或接口紧密相关，就应该把这些常量添加到这个类或接口中
    //如果常量被看作枚举，就应该使用枚举类型，否则应该构造器私有，使用不可实例化的工具类来导出这些常量
    //使用时：PhysicalConstants.AVOGADROS_NUMBRE


    private PhysicalConstants(){};
}
