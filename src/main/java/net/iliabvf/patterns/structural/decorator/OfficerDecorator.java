/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.decorator;

public class OfficerDecorator implements Officer {
    Officer officer;

    public OfficerDecorator(Officer officer) {
        this.officer = officer;
    }

    @Override
    public String doDuty() {
        return officer.doDuty();
    }
}
