package org.javaacademy.core.homework.homework3.factory_phone.phone;

import org.javaacademy.core.homework.homework3.factory_phone.component.Camera;
import org.javaacademy.core.homework.homework3.factory_phone.component.Case;
import org.javaacademy.core.homework.homework3.factory_phone.component.Cpu;

import java.util.Arrays;

public abstract class Phone {
    protected Camera camera;
    protected Case phoneCase;
    protected Cpu[] cpuArray;

    public Phone(Camera camera, Case phoneCase, Cpu[] cpuArray) {
        this.camera = camera;
        this.phoneCase = phoneCase;
        this.cpuArray = cpuArray;
    }

    protected void printInfo(String modelName) {
        System.out.printf("%s{" +
                          "camera=" + camera +
                          ", phoneCase=" + phoneCase +
                          ", cpuArray=" + Arrays.toString(cpuArray) +
                          '}' + "\n", modelName);
    }

    public void makePhoto() {
        camera.makePhoto();
    }

    public Camera getCamera() {
        return camera;
    }

    public Case getPhoneCase() {
        return phoneCase;
    }

    public Cpu[] getCpuArray() {
        return cpuArray;
    }
}
