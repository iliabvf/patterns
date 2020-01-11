/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.strategy;

public class Sleeping implements Activity {
    @Override
    public void doIt() {
        System.out.println("Sleeping...");
    }
}
