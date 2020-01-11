/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Food burger = new Burger(new MeatMaterial());
        Food cake = new Cake(new FlourMaterial());

        burger.prepareFood();
        cake.prepareFood();
    }
}
