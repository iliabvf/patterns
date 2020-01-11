/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.flyweight;

public class Waiter implements RestaurantWorker {
    @Override
    public void doWork() {
        System.out.println("Waiter serving food to tables...");
    }
}
