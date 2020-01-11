/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.decorator;

public class Captain extends OfficerDecorator {
    public Captain(Officer officer) {
        super(officer);
    }

    public String makeMeetingWithLieutenant(){
        return " Make Meeting With Lieutenant";
    }

    @Override
    public String doDuty() {
        return super.doDuty() + makeMeetingWithLieutenant();
    }
}
