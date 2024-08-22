package org.javaacademy.core.lesson9.ex3;

public class Car {
    private Engine engine = new Engine(20);

    /**
     * Вложенный статический класс (можно создать без Car)
     */
    public static class Engine {
        private int power;

        public Engine(int power) {
            this.power = power;
        }
    }

    public static void doSomething() {

    }
}

