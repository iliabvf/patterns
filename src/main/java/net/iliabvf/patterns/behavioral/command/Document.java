/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.command;

public class Document {
    public void create(){
        System.out.println("Creating document...");
    }

    public void saving(){
        System.out.println("Saving document...");
    }

    public void posting(){
        System.out.println("Posting document...");
    }
}
