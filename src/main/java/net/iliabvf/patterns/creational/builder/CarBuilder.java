/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.builder;

public abstract class CarBuilder {
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildPower();

    Car getCar(){
        return car;
    }
}
