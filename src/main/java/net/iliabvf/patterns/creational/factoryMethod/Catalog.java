/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.factoryMethod;

public interface Catalog {
    void createCatalogItem(String name, Integer code);

    static Catalog createCatalogByName(String catalogName, String name, Integer code){
        if (catalogName.equalsIgnoreCase("Customers")){
            CatalogFactory catalogFactory = new CustomersCatalogFactory();
            Catalog catalogItem = catalogFactory.createCatalog(name, code);
            return catalogItem;
        } else if (catalogName.equalsIgnoreCase("Goods")) {
            CatalogFactory catalogFactory = new GoodsCatalogFactory();
            Catalog catalogItem = catalogFactory.createCatalog(name, code);
            return catalogItem;
        } else {
            throw new RuntimeException(catalogName + " does not exists.");
        }
    }
}
