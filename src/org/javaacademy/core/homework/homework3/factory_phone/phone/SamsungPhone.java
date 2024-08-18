package org.javaacademy.core.homework.homework3.factory_phone.phone;

import org.javaacademy.core.homework.homework3.factory_phone.component.Camera;
import org.javaacademy.core.homework.homework3.factory_phone.component.Case;
import org.javaacademy.core.homework.homework3.factory_phone.component.Cpu;

import java.util.Arrays;

public class SamsungPhone extends Phone {
    private static final String MODEL_NAME = "SamsungPhone";

    public SamsungPhone(Camera camera, Case phoneCase, Cpu cpu) {
        super(camera, phoneCase, new Cpu[]{cpu});
    }

    public void printInfo() {
        super.printInfo(MODEL_NAME);
    }
}
