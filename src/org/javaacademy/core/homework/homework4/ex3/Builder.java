package org.javaacademy.core.homework.homework4.ex3;

public class Builder extends Human {
    @Override
    public String makeSound() {
        return "Я строитель " + super.makeSound();
    }
}
