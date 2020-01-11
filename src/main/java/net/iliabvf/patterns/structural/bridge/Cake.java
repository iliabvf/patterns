/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.bridge;

public class Cake extends Food {

    public Cake(Material material) {
        super(material);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing cake...");
        material.prepareMaterialForFood();
    }
}
