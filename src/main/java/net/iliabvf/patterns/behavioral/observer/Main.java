/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        HRSite hrSite = new HRSite();

        hrSite.addVacancy("Sales manager");
        hrSite.addVacancy("CTO");

        Observer subscriber1 = new Subscriber("Bill Gates");
        Observer subscriber2 = new Subscriber("Elon Musk");

        hrSite.addObserver(subscriber1);
        hrSite.addObserver(subscriber2);

        hrSite.addVacancy("CEO");
        hrSite.removeVacancy("CTO");

    }
}
