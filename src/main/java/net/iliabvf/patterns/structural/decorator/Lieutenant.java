/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.decorator;

public class Lieutenant implements Officer {
    @Override
    public String doDuty() {
        return "Serving country.";
    }


}
