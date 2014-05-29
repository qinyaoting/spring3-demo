package com.xyz.effect.chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/27/14
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */

// Enum type with data and behavior
public enum  Plant {

    //对于大多数枚举类型都足够了

    MERCURY(3.302e+23, 2.439e6),
    VENUS(3.302e+23, 2.439e6),
    EARTH(3.302e+23, 2.439e6),
    MARS(3.302e+23, 2.439e6),
    JUPITER(3.302e+23, 2.439e6),
    SATURN(3.302e+23, 2.439e6),
    URANUS(3.302e+23, 2.439e6),
    NEPTUNE(3.302e+23, 2.439e6);

    private final double mass;               //In kilograms
    private final double radius;             //In meters
    private final double surfaceGravity;     // in m/s^2

    private static final double G = 6.67300E-11;

    // Constructor
    Plant(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * (radius * radius);
    }

    // Universal gravitational constant in m^3 / kg s^2
    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }

    public double mass() {
        return mass;
    }

    public double radius() {
        return radius;
    }

    public double surfaceGravity() {
        return surfaceGravity;
    }
}
