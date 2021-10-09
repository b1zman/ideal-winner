package com.shape;

public class Pyramid implements Shape {
    private final double s;
    private final double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return s * h / 3;
    }
}
