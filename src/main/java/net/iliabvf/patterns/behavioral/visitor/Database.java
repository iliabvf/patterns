/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.visitor;

public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
