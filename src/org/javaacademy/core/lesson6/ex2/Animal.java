package org.javaacademy.core.lesson6.ex2;

public abstract class Animal extends Object {
    protected int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    public abstract void makeSound();

    public void breath() {
        System.out.println("Животное дышит");
    }
}
