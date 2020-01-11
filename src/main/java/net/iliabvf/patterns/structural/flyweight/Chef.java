/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.flyweight;

public class Chef implements RestaurantWorker {
    @Override
    public void doWork() {
        System.out.println("Chef is preparing food...");
    }
}
