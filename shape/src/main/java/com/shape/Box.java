package com.shape;

import java.util.ArrayList;
import java.util.List;

public class Box implements Shape {
    private double volume;
    private List<Shape> shapes = new ArrayList<>();

    public boolean addShape(Shape shape) {
        double size = 0;
        for (Shape el : shapes
        ) {
            size = size + el.getVolume();

        }
        if (size + shape.getVolume() > volume) {
            return false;

        } else {
            shapes.add(shape);
            return true;
        }

    }


    public Box(double volume) {
        this.volume = volume;
    }

    public double freeSpace() {
        double size = 0;
        for (Shape el : shapes
        ) {
            size = size + el.getVolume();

        }
        return volume - size;
    }

    @Override
    public double getVolume() {
        return volume;
    }

}
