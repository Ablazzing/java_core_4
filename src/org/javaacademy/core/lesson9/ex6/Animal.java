package org.javaacademy.core.lesson9.ex6;

public abstract class Animal {
    protected String name;
    //животное - бегать (за кем бежит), орать, спать
    //тигр
    //собака


    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(Animal animal);

    public abstract void shout();

    public abstract void sleep();
}
