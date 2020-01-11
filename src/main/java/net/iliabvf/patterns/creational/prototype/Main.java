/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Human vasek = new Human("Brown", 39, 'M', "Vasek");

        System.out.println("Original human:");
        System.out.println(vasek);

        HumansFactory humansFactory = new HumansFactory(vasek);
        Human vaseksClone = humansFactory.cloneHuman();

        System.out.println("Clonned human:");
        System.out.println(vaseksClone);

    }
}
