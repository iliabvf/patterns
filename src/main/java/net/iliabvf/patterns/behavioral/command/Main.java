/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Document invoice = new Document();

        Manager salesManager = new Manager(
                new CreateCommand(invoice),
                new SaveCommand(invoice),
                new PostCommand(invoice)
        );

        salesManager.createDocument();
        salesManager.saveDocument();
        salesManager.postDocument();
    }
}
