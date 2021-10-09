package com.shape;

public class Conus implements Shape {
    private final double r;
    private final double h;

    public Conus(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
