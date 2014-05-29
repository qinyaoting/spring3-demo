package com.xyz.effect.chapter6.num30;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/29/14
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
public enum PayrollDay1 {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY, SUNDAY;

    private static final int HOURS_PER_SHIFT = 8;

    double pay(double hoursWorked, double payRate) {
        double basePay = hoursWorked * payRate;

        double overtimePay;
        switch (this) {
            case SATURDAY:case SUNDAY:
                overtimePay = hoursWorked * payRate / 2;
            default:
                overtimePay = hoursWorked <= HOURS_PER_SHIFT?
                        0:(hoursWorked - HOURS_PER_SHIFT) * payRate / 2;
                break;
        }
        return basePay + overtimePay;
    }

    //不可否认，这段代码十分简洁，但从维护角度来看，它非常危险
    //假设将一个新元素添加到该枚举中，但是忘记给switch添加相应的case，程序依然可以编译，但结果肯定错了

}
