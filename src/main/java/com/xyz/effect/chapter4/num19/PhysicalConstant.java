package com.xyz.effect.chapter4.num19;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/15/14
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PhysicalConstant {


    static final double AVOGADROS_NUMBRE = 6.02214199e23;

    static final double BOLTZMANN_CONSTANT = 1.3806503e-23;

    static final double ELECTRON_MASS = 9.10938188e-31;

    //常量接口模式是对接口的不良使用
    //实现常量接口，会导致把这样的实现细节泄漏到该类的导出API中
}
