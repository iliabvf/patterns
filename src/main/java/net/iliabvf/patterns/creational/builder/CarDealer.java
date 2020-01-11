/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.builder;

public class CarDealer {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar(){
        carBuilder.createCar();
        carBuilder.buildName();
        carBuilder.buildPower();
        carBuilder.buildPrice();
        return carBuilder.getCar();
    }
}
