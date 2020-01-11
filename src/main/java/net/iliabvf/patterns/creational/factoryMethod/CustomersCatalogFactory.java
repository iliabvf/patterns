/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.factoryMethod;

public class CustomersCatalogFactory implements CatalogFactory {
    @Override
    public Catalog createCatalog(String name, Integer code) {
        System.out.println("Creating customer " + name + ", " + code);
        return new CatalogCustomers();
    }
}
