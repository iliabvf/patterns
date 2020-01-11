/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Messenger.getMessenger().addMessage("Hello chat!");
        Messenger.getMessenger().addMessage("Send all messages here!");

        System.out.println("Last message is: ");
        Messenger.getMessenger().showLastMessage();

        System.out.println("All messages: ");
        Messenger.getMessenger().showMessages();
    }
}
