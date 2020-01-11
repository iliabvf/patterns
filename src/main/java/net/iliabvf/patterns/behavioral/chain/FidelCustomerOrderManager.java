/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.chain;

public class FidelCustomerOrderManager extends OrderManager {
    public FidelCustomerOrderManager(int customerCategory) {
        super(customerCategory);
    }

    @Override
    public void processOrder(String customer, int level) {
        System.out.println("Processing order for fidel customer: " + customer + " by account sales manager...");
    }
}
