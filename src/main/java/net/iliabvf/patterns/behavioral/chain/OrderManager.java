/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.chain;

public abstract class OrderManager {
    private int customerCategory;
    private OrderManager supervisor;

    public OrderManager(int customerCategory){
        this.customerCategory = customerCategory;
    }

    public void setSupervisor(OrderManager supervisor){
        this.supervisor = supervisor;
    }

    public void sendOrderToManager(String customer, int level){
        if (level >= customerCategory){
            processOrder(customer, level);
        }
        if (supervisor != null){
            supervisor.sendOrderToManager(customer, level);
        }
    }

    public abstract void processOrder(String customer, int level);
}
