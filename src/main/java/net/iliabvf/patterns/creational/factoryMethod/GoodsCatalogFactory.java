/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.factoryMethod;

public class GoodsCatalogFactory implements CatalogFactory{
    @Override
    public Catalog createCatalog(String name, Integer code) {
        System.out.println("Creating goods " + name + ", " + code);
        return new GoodsCatalog();
    }
}
