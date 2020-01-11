/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.prototype;

public class HumansFactory {
    Human human;

    public HumansFactory(Human human) {
        this.human = human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    Human cloneHuman(){
        return (Human) human.copy();
    }
}
