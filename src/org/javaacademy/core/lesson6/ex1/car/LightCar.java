package org.javaacademy.core.lesson6.ex1.car;

/**
 * Легковая машина
 */
public class LightCar extends Car {

    public LightCar(int weight, int mySpeed, String color) {
        super(weight, mySpeed, color);
    }

    public LightCar() {
        super(100, 100, "black");
    }

    public void printInfo() {
        System.out.println("Вес машины: " + super.weight);
        super.go();
    }
}
