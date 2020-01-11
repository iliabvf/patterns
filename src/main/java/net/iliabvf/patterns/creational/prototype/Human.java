/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.creational.prototype;

public class Human implements Copyable {
    String eyesColor;
    int age;
    char sex;
    String name;

    public Human(String eyesColor, int age, char sex, String name) {
        this.eyesColor = eyesColor;
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object copy() {
        Human copy = new Human(eyesColor, age, sex, name);
        return copy;
    }

    @Override
    public String toString() {
        return "Human{" +
                "eyesColor='" + eyesColor + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}
