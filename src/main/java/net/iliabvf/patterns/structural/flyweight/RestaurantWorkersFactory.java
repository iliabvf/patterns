/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.StreamSupport;

public class RestaurantWorkersFactory {
    private static final Map<String,RestaurantWorker> workers = new HashMap<>();

    public RestaurantWorker getWorkerByFunction(String functionName){
        RestaurantWorker worker = workers.get(functionName);

        if(worker == null){
            switch (functionName) {
                case "chef":
                    System.out.println("Hiring Chef ...");
                    worker = new Chef();
                    break;
                case "waiter":
                    System.out.println("Hiring Waiter ...");
                    worker = new Waiter();
                    break;
            }

        }
        workers.put(functionName, worker);
        return worker;
    }
}
