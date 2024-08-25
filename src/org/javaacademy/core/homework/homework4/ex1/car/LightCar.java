package org.javaacademy.core.homework.homework4.ex1.car;

public class LightCar extends Car {
    private final boolean hasCroiseControl;

    public LightCar(double height, double length, double width, boolean hasCroiseControl) {
        super(height, length, width);
        this.hasCroiseControl = hasCroiseControl;
    }

    public LightCar(boolean isClean, double height, double length, double width, boolean hasCroiseControl) {
        super(isClean, height, length, width);
        this.hasCroiseControl = hasCroiseControl;
    }

    public boolean isHasCroiseControl() {
        return hasCroiseControl;
    }
}
