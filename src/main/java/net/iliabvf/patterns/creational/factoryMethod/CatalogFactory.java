/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.factoryMethod;

public interface CatalogFactory {
    Catalog createCatalog(String name, Integer code);
}
