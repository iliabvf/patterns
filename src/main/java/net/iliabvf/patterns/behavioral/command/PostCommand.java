/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.command;

public class PostCommand implements Command {
    Document document;

    public PostCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.posting();
    }
}
