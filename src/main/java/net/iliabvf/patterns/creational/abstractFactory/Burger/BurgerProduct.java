/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory.Burger;

import net.iliabvf.patterns.creational.abstractFactory.Product;

public class BurgerProduct implements Product {
    @Override
    public void getFinalProduct() {
        System.out.println("Burger is ready...");
    }
}
