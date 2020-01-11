/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.facade;

public class SaleWorkflow {
    CustomerOrder customerOrder = new CustomerOrder();
    Warehouse warehouse = new Warehouse();
    SalesManager salesManager = new SalesManager();

    public void startSales(){
        customerOrder.createOrder();
        warehouse.prepareOrderItems();
        salesManager.finalizeSalesTransation();
    }
}
