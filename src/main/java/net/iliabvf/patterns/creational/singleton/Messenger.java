/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.singleton;

public class Messenger {
    private static Messenger messenger;

    private static String messages = "";

    private static String lastMessage;

    public static synchronized Messenger getMessenger(){
        if (messenger == null){
            messenger = new Messenger();
        }
        return messenger;
    }

    void showMessages(){
        System.out.println(messages);
    }

    void showLastMessage(){
        System.out.println(lastMessage);
    }

    void addMessage(String newMessage){
        lastMessage = newMessage;
        messages += lastMessage + "\n";
    }
}
