/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Memento;

public class Matrix {
    private Save save;

    public Save getSave(){
        return save;
    }

    public void setSave(Save save){
        this.save = save;
    }
}
