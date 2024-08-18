package org.javaacademy.core.homework.homework3.factory_phone.component;

public class Camera {
    private int countMegaPixels;

    public Camera(int countMegaPixels) {
        this.countMegaPixels = countMegaPixels;
    }

    public int getCountMegaPixels() {
        return countMegaPixels;
    }

    public void makePhoto() {
        System.out.println("Сделано фото!");
    }

    public void setCountMegaPixels(int countMegaPixels) {
        this.countMegaPixels = countMegaPixels;
    }
}
