package com.xyz.effect.chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/27/14
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */
public enum  Plant {

    MERCURY(3.302e+23, 2.439e6),
    VENUS(3.302e+23, 2.439e6),
    EARTH(3.302e+23, 2.439e6),
    MARS(3.302e+23, 2.439e6),
    JUPITER(3.302e+23, 2.439e6),
    SATURN(3.302e+23, 2.439e6),
    URANUS(3.302e+23, 2.439e6),
    NEPTUNE(3.302e+23, 2.439e6);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.67300E-11;

    Plant(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * (radius * radius);
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }
}
