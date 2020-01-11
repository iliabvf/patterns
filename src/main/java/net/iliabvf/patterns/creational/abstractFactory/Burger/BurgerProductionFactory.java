/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory.Burger;

import net.iliabvf.patterns.creational.abstractFactory.Material;
import net.iliabvf.patterns.creational.abstractFactory.Product;
import net.iliabvf.patterns.creational.abstractFactory.ProductionFactory;
import net.iliabvf.patterns.creational.abstractFactory.ProductionProcess;

public class BurgerProductionFactory implements ProductionFactory {
    @Override
    public Material getMaterial() {
        return new MeatMaterial();
    }

    @Override
    public ProductionProcess getProductionProcess() {
        return new BurgerProductionProcess();
    }

    @Override
    public Product getProduct() {
        return new BurgerProduct();
    }
}
