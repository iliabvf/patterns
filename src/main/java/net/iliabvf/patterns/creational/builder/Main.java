/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        CarDealer carDealer = new CarDealer();
        carDealer.setCarBuilder(new TeslaCarBuilder());
        Car tesla = carDealer.buildCar();

        System.out.println(tesla);

        carDealer.setCarBuilder(new LadaCarBuilder());
        Car lada = carDealer.buildCar();

        System.out.println(lada);


    }
}
