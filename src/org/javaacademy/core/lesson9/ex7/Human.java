package org.javaacademy.core.lesson9.ex7;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void greetings(Human human) {
        System.out.println("Привет, меня зовут " + name);
        human.greetings(this);
    }
}
