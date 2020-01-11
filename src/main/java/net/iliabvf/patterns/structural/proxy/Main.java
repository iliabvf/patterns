/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Car car = new ProxyCar();
        car.start();
    }

}
