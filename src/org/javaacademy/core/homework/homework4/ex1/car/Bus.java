package org.javaacademy.core.homework.homework4.ex1.car;

public class Bus extends Car {
    private final int maxCountPassengers;

    public Bus(double height, double length, double width, int maxCountPassengers) {
        super(height, length, width);
        this.maxCountPassengers = maxCountPassengers;
    }

    public Bus(boolean isClean, double height, double length, double width, int maxCountPassengers) {
        super(isClean, height, length, width);
        this.maxCountPassengers = maxCountPassengers;
    }


    public int getMaxCountPassengers() {
        return maxCountPassengers;
    }
}
