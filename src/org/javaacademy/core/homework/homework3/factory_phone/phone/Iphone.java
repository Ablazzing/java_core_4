package org.javaacademy.core.homework.homework3.factory_phone.phone;

import org.javaacademy.core.homework.homework3.factory_phone.component.Camera;
import org.javaacademy.core.homework.homework3.factory_phone.component.Case;
import org.javaacademy.core.homework.homework3.factory_phone.component.Cpu;

import java.util.Arrays;

public class Iphone extends Phone {
    private static final String MODEL_NAME = "Iphone";

    public Iphone(Camera camera, Case phoneCase, Cpu cpu1, Cpu cpu2) {
        super(camera, phoneCase, new Cpu[]{cpu1, cpu2});
        for (Cpu cpu : this.cpuArray) {
            if (cpu == null) {
                throw new RuntimeException("Не может быть телефон с процессором равным null");
            }
        }
    }

    public void printInfoCpu() {
        System.out.printf("Инфо о процессорах: %s\n", Arrays.toString(cpuArray));
    }

    public void printInfo() {
        super.printInfo(MODEL_NAME);
    }
}
