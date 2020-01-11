/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.proxy;

public class ProxyCar implements Car {
    private OldCar oldCar;

    public ProxyCar() {

    }

    @Override
    public void start() {
        if (oldCar == null){
            oldCar = new OldCar();
        }
        oldCar.start();
        oldCar.insterKey();
        oldCar.rotateKey();
        oldCar.releasePedal();
    }

}
