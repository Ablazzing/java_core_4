package org.javaacademy.core.lesson7.airport_ex2;

public class Mi20Helicopter extends Helicopter {
    @Override
    public void fly() {
        System.out.println("Вертолет ми20 летит");
    }

    public void catapultPilot() {
        System.out.println("Катапультируем пилота");
    }
}
