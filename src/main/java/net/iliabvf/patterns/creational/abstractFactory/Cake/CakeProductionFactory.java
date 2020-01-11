/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory.Cake;

import net.iliabvf.patterns.creational.abstractFactory.Material;
import net.iliabvf.patterns.creational.abstractFactory.Product;
import net.iliabvf.patterns.creational.abstractFactory.ProductionFactory;
import net.iliabvf.patterns.creational.abstractFactory.ProductionProcess;

public class CakeProductionFactory implements ProductionFactory {
    @Override
    public Material getMaterial() {
        return new FlourMaterial();
    }

    @Override
    public ProductionProcess getProductionProcess() {
        return new CakeProductionProcess();
    }

    @Override
    public Product getProduct() {
        return new CakeProduct();
    }
}
