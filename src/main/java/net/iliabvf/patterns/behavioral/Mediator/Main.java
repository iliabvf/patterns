/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User evgeniy = new SimpleUser(chat, "Evgeniy");
        User vasiliy = new SimpleUser(chat, "Vasiliy");

        chat.setAdmin(admin);
        chat.addUserToChat(evgeniy);
        chat.addUserToChat(vasiliy);

        evgeniy.sendMessage("Privet vsem.");
    }
}
