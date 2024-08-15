package org.javaacademy.core.lesson7.airport_ex2;

public class Airplane implements Flyable {
    private int enginePower;

    public Airplane(int enginePower) {
        this.enginePower = enginePower;
    }

    public void fly() {
        if (enginePower > 0) {
            System.out.println("Самолет летит");
        }
    }

    @Override
    public void land() {
        System.out.println("Самолет приземлился");
    }
}
