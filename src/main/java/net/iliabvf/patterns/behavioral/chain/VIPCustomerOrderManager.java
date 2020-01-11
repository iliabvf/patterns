/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.chain;

public class VIPCustomerOrderManager extends OrderManager {
    public VIPCustomerOrderManager(int customerCategory) {
        super(customerCategory);
    }

    @Override
    public void processOrder(String customer, int level) {
        System.out.println("Processing order for VIP customer: " + customer + " by top manager...");
    }
}
