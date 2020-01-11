/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.command;

public class Manager {
    Command create;
    Command save;
    Command post;

    public Manager(Command create, Command save, Command post) {
        this.create = create;
        this.save = save;
        this.post = post;
    }

    public void createDocument(){
        create.execute();
    }

    public void saveDocument(){
        save.execute();
    }

    public void postDocument(){
        post.execute();
    }
}
