/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.bridge;

public class Burger extends Food {
    public Burger(Material material) {
        super(material);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing burger...");
        material.prepareMaterialForFood();
    }
}
