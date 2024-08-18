package org.javaacademy.core.homework.homework3.factory_phone.component;

/**
 * Корпус телефона
 */
public class Case {
    private int width; //ширина
    private int height; //высота
    private int length; //длина

    public Case(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
