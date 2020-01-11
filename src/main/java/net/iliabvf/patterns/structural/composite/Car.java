/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Part> parts = new ArrayList<Part>();

    public void addPart(Part part){
        parts.add(part);
    }

    public void removePart(Part part){
        parts.remove(part);
    }

    public void createCar(){
        System.out.println("Starting assembling car...");
        for (Part part : parts){
            part.assemble();
        }
    }
}
