/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.builder;

public class LadaCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Lada Samara");
    }

    @Override
    void buildPrice() {
        car.setPrice(2000);
    }

    @Override
    void buildPower() {
        car.setPower(50);
    }
}
