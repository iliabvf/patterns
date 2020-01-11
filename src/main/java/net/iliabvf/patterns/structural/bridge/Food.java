/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.bridge;

public abstract class Food {
    protected Material material;

    protected Food(Material material) {
        this.material = material;
    }

    public abstract void prepareFood();
}
