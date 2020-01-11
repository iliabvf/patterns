/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.composite;

public class Wheel implements Part {
    @Override
    public void assemble() {
        System.out.println("Assembling wheel...");
    }
}
