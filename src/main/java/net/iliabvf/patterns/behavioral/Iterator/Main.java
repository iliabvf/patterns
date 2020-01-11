/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] features = {"Electric drive", "Autopilot", "450 km range", "21inch display"};
        Car tesla = new Car("Tesla model S", features);

        Iterator iterator = tesla.getIterator();

        System.out.println("Car: " + tesla.getName() + ", features: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
