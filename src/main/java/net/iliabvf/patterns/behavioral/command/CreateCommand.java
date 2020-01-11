/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.command;

public class CreateCommand implements Command {
    Document document;

    public CreateCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.create();
    }
}
