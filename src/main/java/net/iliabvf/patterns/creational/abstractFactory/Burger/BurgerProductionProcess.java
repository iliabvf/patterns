/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory.Burger;

import net.iliabvf.patterns.creational.abstractFactory.ProductionProcess;

public class BurgerProductionProcess implements ProductionProcess {
    @Override
    public void executeProductionProcess() {
        System.out.println("Fry meat add vegitables and bread...");
    }
}
