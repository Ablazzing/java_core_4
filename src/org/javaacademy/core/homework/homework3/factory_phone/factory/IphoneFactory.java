package org.javaacademy.core.homework.homework3.factory_phone.factory;

import org.javaacademy.core.homework.homework3.factory_phone.component.Camera;
import org.javaacademy.core.homework.homework3.factory_phone.component.Case;
import org.javaacademy.core.homework.homework3.factory_phone.component.Cpu;
import org.javaacademy.core.homework.homework3.factory_phone.phone.Iphone;
import org.javaacademy.core.homework.homework3.factory_phone.phone.SamsungPhone;

public class IphoneFactory {
    private static final int COUNT_MEGAPIXELS = 8;
    private static final int CPU_MHZ = 1000;
    private static final int CASE_WIDTH = 60;
    private static final int CASE_HEIGHT = 200;
    private static final int CASE_LENGTH = 10;

    public static Iphone createPhone() {
        Camera camera = new Camera(COUNT_MEGAPIXELS);
        Cpu cpu = new Cpu(CPU_MHZ);
        Cpu cpu2 = new Cpu(CPU_MHZ);
        Case aCase = new Case(CASE_WIDTH, CASE_HEIGHT, CASE_LENGTH);
        return new Iphone(camera, aCase, cpu, cpu2);
    }
}
