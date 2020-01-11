/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.bridge;

public class MeatMaterial implements Material {
    @Override
    public void prepareMaterialForFood() {
        System.out.println("Preparing meat for burger...");
    }
}
