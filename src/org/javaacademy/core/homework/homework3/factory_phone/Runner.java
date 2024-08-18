package org.javaacademy.core.homework.homework3.factory_phone;

import org.javaacademy.core.homework.homework3.factory_phone.component.Camera;
import org.javaacademy.core.homework.homework3.factory_phone.component.Case;
import org.javaacademy.core.homework.homework3.factory_phone.component.Cpu;
import org.javaacademy.core.homework.homework3.factory_phone.factory.IphoneFactory;
import org.javaacademy.core.homework.homework3.factory_phone.factory.SamsungFactory;
import org.javaacademy.core.homework.homework3.factory_phone.phone.Iphone;
import org.javaacademy.core.homework.homework3.factory_phone.phone.SamsungPhone;

public class Runner {
    public static void main(String[] args) {
        SamsungPhone samsungPhone = SamsungFactory.createPhone();
        SamsungPhone samsungPhone2 = SamsungFactory.createPhone();
        Camera camera1 = samsungPhone.getCamera();
        camera1.setCountMegaPixels(10);
        Camera camera2 = samsungPhone2.getCamera();

        System.out.println(camera1.getCountMegaPixels());
        System.out.println(camera2.getCountMegaPixels());
        Iphone iphone = IphoneFactory.createPhone();
        iphone.printInfo();
        samsungPhone.printInfo();
    }
}
