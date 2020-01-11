/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.state;

public class Reading implements Activity {
    @Override
    public void justDoit() {
        System.out.println("Reading book...");
    }
}
