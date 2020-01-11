/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Memento;

import java.util.Date;

public class AgentSmith {
    private String version;
    private Date date;

    public void setVersionAndDate(String version){
        this.version = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "AgentSmith{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
