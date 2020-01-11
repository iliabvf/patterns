/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.proxy;

import java.util.stream.StreamSupport;

public class OldCar implements Car {

    public OldCar() {
        load();
    }

    public void load(){
        System.out.println("Loading into car ...");
    }

    @Override
    public void start() {
        System.out.println("Preparing to driver...");
    }

    public void insterKey() {
        System.out.println("Inserting key...");
    }

    public void rotateKey() {
        System.out.println("Rotating key to the right...");
    }

    public void releasePedal() {
        System.out.println("Releasing pedal...");
    }


}
