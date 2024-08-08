package org.javaacademy.core.lesson5.animal;

import java.util.Arrays;

import static org.javaacademy.core.lesson5.animal.Dog.COUNT_LEGS;

public class Runner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Мухтар");
        Dog dog2 = new Dog("Перс");
        System.out.println(dog1);
        System.out.println(dog2);

        AnotherClass.createDogs();

        //System.out.println(Arrays.toString(Dog.dogs));

        System.out.println("У всех собак количество ног: " + COUNT_LEGS);
        Dog.printDogNames();


    }
}
