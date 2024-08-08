package org.javaacademy.core.lesson6.ex2;

public class Runner {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        Cat cat = new Cat(10);
        animals[0] = cat;

        Dog dog = new Dog(50);
        animals[1] = dog;

        for (Animal animal : animals) {
            animal.makeSound();
            animal.breath();
        }

        System.out.println(cat);
        System.out.println(dog);
    }
}
