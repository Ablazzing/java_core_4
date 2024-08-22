package org.javaacademy.core.lesson9.ex6;

public class Runner {
    public static void main(String[] args) {
        //животное - бегать (за кем бежит), орать, спать
        //тигр
        //собака
        Animal tiger = new Animal("Тигр") {

            @Override
            public void run(Animal animal) {
                System.out.println("Тигр бежит за: " + animal.name);
            }

            @Override
            public void shout() {
                System.out.println("Тигр орет");
            }

            @Override
            public void sleep() {
                System.out.println("Тигр спит");
            }

            @Override
            public String toString() {
                return "Тигр";
            }
        };

        Animal dog = new Animal("Собака") {

            @Override
            public String toString() {
                return "Собака";
            }

            @Override
            public void run(Animal animal) {
                System.out.println("Собака бежит за: " + animal.name);
            }

            @Override
            public void shout() {
                System.out.println("Собака лает");
            }

            @Override
            public void sleep() {
                System.out.println("Собака спит");
            }
        };

        tiger.run(tiger);
    }
}
