/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        AgentSmith agentSmith = new AgentSmith();
        Matrix matrix = new Matrix();

        System.out.println("Creating Agent Smith version 1.0");
        agentSmith.setVersionAndDate("Version 1.0");

        System.out.println(agentSmith);

        System.out.println("Saving current Agent Smith to Matrix...");
        matrix.setSave(agentSmith.save());

        System.out.println("Agent Smith was killed by Neo...");
        System.out.println("Updating state...");

        agentSmith.setVersionAndDate("Version 1.1");
        System.out.println("Current state: " + agentSmith);

        System.out.println("Need to roll back to previous state...");
        agentSmith.load(matrix.getSave());

        System.out.println("Agent smith previous state recovered.");
        System.out.println("Current state: " + agentSmith);
    }
}
