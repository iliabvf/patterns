/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.adapter;

public class AdapterDriverToCar extends Driver implements Car {
    @Override
    public void moveLeft() {
        moveWheelLeft();
        System.out.println("Car moving left");
    }

    @Override
    public void moveRight() {
        moveWheelRight();
        System.out.println("Car moving right");
    }

    @Override
    public void moveForward() {
        accelerate();
        System.out.println("Car moving forward");
    }

    @Override
    public void moveBackward() {
        reverse();
        System.out.println("Car moving backwards");
    }
}
