/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        System.out.println("Welcome page:");
        welcomePage.showPage();

        System.out.println("News page:");
        newsPage.showPage();
    }
}
