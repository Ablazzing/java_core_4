package org.javaacademy.core.lesson6.ex1.car;

/**
 * Тяжелый грузовик
 */
public class HeavyTruck extends Truck {
    private int countWheels;

    public HeavyTruck(int weight, int maxSpeed, String color, int countWheels) {
        super(weight, maxSpeed, color);
        this.countWheels = countWheels;
    }
}
