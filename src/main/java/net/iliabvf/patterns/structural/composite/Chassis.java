/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.composite;

public class Chassis implements Part {
    @Override
    public void assemble() {
        System.out.println("Assembling car chassis...");
    }
}
