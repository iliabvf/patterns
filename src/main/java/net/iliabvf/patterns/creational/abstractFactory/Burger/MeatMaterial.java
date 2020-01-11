/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory.Burger;

import net.iliabvf.patterns.creational.abstractFactory.Material;

public class MeatMaterial implements Material {
    @Override
    public void processMaterial() {
        System.out.println("Meat is cut and prepared...");
    }
}
