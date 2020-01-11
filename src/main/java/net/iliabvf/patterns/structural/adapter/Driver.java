/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.structural.adapter;

public class Driver {
    void moveWheelLeft(){
        System.out.println("Moving driver wheel to left ...");
    }

    void moveWheelRight(){
        System.out.println("Moving driver wheel to right ...");
    }

    void accelerate(){
        System.out.println("Pushing accelerate pedal ...");
    }

    void reverse(){
        System.out.println("Changing shift to reverse ...");
    }
}
