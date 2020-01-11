/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Officer lieutenant = new Lieutenant();
        System.out.println(lieutenant.doDuty());

        Officer captain = new Captain(new Lieutenant());
        System.out.println(captain.doDuty());

    }
}
