/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory.Cake;

import net.iliabvf.patterns.creational.abstractFactory.ProductionProcess;

public class CakeProductionProcess implements ProductionProcess {
    @Override
    public void executeProductionProcess() {
        System.out.println("Add eggs, butter and sugar and bake cake 1 hour...");
    }
}
