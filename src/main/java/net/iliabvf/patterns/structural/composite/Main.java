/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Part frontLeftWheel = new Wheel();
        Part frontRightWheel = new Wheel();
        Part backLeftWheel = new Wheel();
        Part backRightWheel = new Wheel();
        Part chassis = new Chassis();

        car.addPart(frontLeftWheel);
        car.addPart(frontRightWheel);
        car.addPart(backLeftWheel);
        car.addPart(backRightWheel);
        car.addPart(chassis);

        car.createCar();
    }
}
