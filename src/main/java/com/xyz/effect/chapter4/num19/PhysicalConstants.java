package com.xyz.effect.chapter4.num19;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/26/14
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhysicalConstants {


    //如果要导出常量，几种合理的方案

    // 如果这些常量与牧歌现有的类或接口紧密相连，就应该把这些常量加到这个类或接口中

    // 例如   Integer和Double都导出了MIN_VALUE MAX_VALUE常量

    //如果常量被看作枚举，就应该使用枚举类型，否则应该构造器私有，使用不可实例化的工具类来导出这些常量
    //使用时：PhysicalConstants.AVOGADROS_NUMBRE


    private PhysicalConstants(){}


    public static final double AVOGADROS_NUMBRE = 6.02214199e23;

    public static final double BOLTZMANN_CONSTANT = 1.3806503e-23;

    public static final double ELECTRON_MASS = 9.10938188e-31;

    // 接口应该只被定义类型，不应该被用来导出常量
}
