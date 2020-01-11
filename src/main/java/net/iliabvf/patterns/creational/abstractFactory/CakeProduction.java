/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.abstractFactory;

import net.iliabvf.patterns.creational.abstractFactory.Cake.CakeProductionFactory;

public class CakeProduction {

    private final static String WELCOME_STRING1 =  "Welcome to Pattern app v.0.1 (by Budeanu Vasile).";

    public static void main(String[] args) {

        System.out.println(WELCOME_STRING1);

        ProductionFactory productionFactory = new CakeProductionFactory();

        Material material = productionFactory.getMaterial();
        material.processMaterial();

        ProductionProcess productionProcess = productionFactory.getProductionProcess();
        productionProcess.executeProductionProcess();

        Product product = productionFactory.getProduct();
        product.getFinalProduct();

    }
}
