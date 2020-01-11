/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.chain;

public class NewCustomerOrderManager extends OrderManager {
    public NewCustomerOrderManager(int customerCategory) {
        super(customerCategory);
    }

    @Override
    public void processOrder(String customer, int level) {
        System.out.println("Processing order for new customer: " + customer + " by assistant sales manager...");
    }
}
