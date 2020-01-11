/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory;

public interface ProductionFactory {
    Material getMaterial();
    ProductionProcess getProductionProcess();
    Product getProduct();

}
