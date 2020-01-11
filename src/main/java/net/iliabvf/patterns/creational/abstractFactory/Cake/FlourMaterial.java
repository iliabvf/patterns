/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory.Cake;

import net.iliabvf.patterns.creational.abstractFactory.Material;

public class FlourMaterial implements Material {
    @Override
    public void processMaterial() {
        System.out.println("Flour and water is prepared...");
    }
}
