package com.xyz.effect.chapter6.num30;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/29/14
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
enum PayrollDay2 {

    MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY), THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PayrollDay2(PayType payType) {this.payType = payType;}

    double pay(double hoursWorked, double payRate) {
        return payType.pay(hoursWorked, payRate);
    }

    private enum PayType {
        WEEKDAY {
            double overTimePay(double hours, double payRate) {
                return hours <= HOURS_PER_SHIFT ? 0:
                        (hours - HOURS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            double overTimePay(double hours, double payRate) {
                return hours * payRate / 2;
            }
        };

        private static final int HOURS_PER_SHIFT = 8;

        abstract double overTimePay(double hrs, double payRate);

        double pay(double hoursWorked, double payRate) {
            double basePay = hoursWorked * payRate;
            return basePay + overTimePay(hoursWorked, payRate);
        }

    }


}
