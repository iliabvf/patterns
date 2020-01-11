/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.bridge;

public class FlourMaterial implements Material {
    @Override
    public void prepareMaterialForFood() {
        System.out.println("Preparing flour for cake...");
    }
}
