package org.javaacademy.core.test;

import org.javaacademy.core.lesson5.car.Car;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Легковая");
        System.out.println(car.getWeight());
    }
}
