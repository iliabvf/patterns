/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.builder;

public class TeslaCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Tesla model S");
    }

    @Override
    void buildPrice() {
        car.setPrice(70000);
    }

    @Override
    void buildPower() {
        car.setPower(400);
    }
}
