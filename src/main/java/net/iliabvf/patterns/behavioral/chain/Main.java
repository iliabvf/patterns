/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.chain;

import net.iliabvf.patterns.structural.facade.CustomerOrder;

public class Main {
    public static void main(String[] args) {
        OrderManager assistantManager = new NewCustomerOrderManager(CustomerCategory.newCustomer);
        OrderManager salesManager = new FidelCustomerOrderManager(CustomerCategory.fidelCustomer);
        OrderManager topManager = new VIPCustomerOrderManager(CustomerCategory.vipCustomer);

        assistantManager.setSupervisor(salesManager);
        salesManager.setSupervisor(topManager);

        assistantManager.sendOrderToManager("Ivan Ivanov", CustomerCategory.newCustomer);
        assistantManager.sendOrderToManager("Oracle", CustomerCategory.fidelCustomer);
        assistantManager.sendOrderToManager("Trump", CustomerCategory.vipCustomer);
    }
}
