/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Car car = new AdapterDriverToCar();

        car.moveForward();
        car.moveLeft();
        car.moveRight();
        car.moveBackward();
    }
}
