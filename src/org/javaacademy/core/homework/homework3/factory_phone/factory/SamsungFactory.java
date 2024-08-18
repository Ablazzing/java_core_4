package org.javaacademy.core.homework.homework3.factory_phone.factory;

import org.javaacademy.core.homework.homework3.factory_phone.component.Camera;
import org.javaacademy.core.homework.homework3.factory_phone.component.Case;
import org.javaacademy.core.homework.homework3.factory_phone.component.Cpu;
import org.javaacademy.core.homework.homework3.factory_phone.phone.SamsungPhone;

public class SamsungFactory {
    private static final int COUNT_MEGAPIXELS = 16;
    private static final int CPU_MHZ = 1500;
    private static final int CASE_WIDTH = 60;
    private static final int CASE_HEIGHT = 200;
    private static final int CASE_LENGTH = 15;

    public static SamsungPhone createPhone() {
        Camera camera = new Camera(COUNT_MEGAPIXELS);
        Cpu cpu = new Cpu(CPU_MHZ);
        Case aCase = new Case(CASE_WIDTH, CASE_HEIGHT, CASE_LENGTH);
        return new SamsungPhone(camera, aCase, cpu);
    }
}
