package org.javaacademy.core.homework.homework4.ex1.car;

public abstract class Car {
    protected boolean isClean = true;
    protected final double height; // высота
    protected final double length; // длина
    protected final double width; // ширина

    public Car(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Car(boolean isClean, double height, double length, double width) {
        this.isClean = isClean;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
