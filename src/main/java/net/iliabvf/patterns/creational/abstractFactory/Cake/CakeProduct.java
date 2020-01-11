/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory.Cake;

import net.iliabvf.patterns.creational.abstractFactory.Product;

public class CakeProduct implements Product {
    @Override
    public void getFinalProduct() {
        System.out.println("Cake is ready...");
    }
}
