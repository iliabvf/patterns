/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantWorkersFactory workersFactory = new RestaurantWorkersFactory();

        List<RestaurantWorker> workers = new ArrayList<>();

        workers.add(workersFactory.getWorkerByFunction("chef"));
        workers.add(workersFactory.getWorkerByFunction("waiter"));
        workers.add(workersFactory.getWorkerByFunction("waiter"));
        workers.add(workersFactory.getWorkerByFunction("waiter"));
        workers.add(workersFactory.getWorkerByFunction("waiter"));

        for (RestaurantWorker worker: workers){
            worker.doWork();
        }
    }
}
