/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.state;

public class Sleeping implements Activity {
    @Override
    public void justDoit() {
        System.out.println("Sleeping...");
    }
}
