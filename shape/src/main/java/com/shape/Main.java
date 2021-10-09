package com.shape;

public class Main {
    public static void main(String[] args) {
        Pyramid pyramid1 = new Pyramid(10, 10);
        Conus conus1 = new Conus(10, 10);
        Conus conus2 = new Conus(1, 10);
        Pyramid pyramid2 = new Pyramid (50,100);
        Box box = new Box(2000);
        System.out.printf(box.addShape(pyramid1) + " осталось объема " + "%.2f\n", box.freeSpace());
        System.out.printf(box.addShape(conus1) + " осталось объема " + "%.2f\n", box.freeSpace());
        System.out.printf(box.addShape(conus2) + " осталось объема " + "%.2f\n", box.freeSpace());
        System.out.printf(box.addShape(pyramid2) + " осталось объема " + "%.2f\n", box.freeSpace());
    }

}
