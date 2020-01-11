/*
 * Copyright (c) 2019. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.factoryMethod;

public class Main {

    private final static String WELCOME_STRING1 =  "Welcome to Pattern app v.0.1 (by Budeanu Vasile).";

    public static void main(String[] args) {

        System.out.println(WELCOME_STRING1);

        Catalog customer1 = Catalog.createCatalogByName("Customers", "Microsoft", 1);
        Catalog customer2 = Catalog.createCatalogByName("Customers", "Oracle", 2);

        Catalog good1 = Catalog.createCatalogByName("Goods", "Windows 10", 1);
        Catalog good2 = Catalog.createCatalogByName("Goods", "Java SE", 2);

    }
}
