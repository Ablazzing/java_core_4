package org.javaacademy.core.lesson7.airport_ex2;

public class Duck implements Flyable {
    private boolean isMale;

    public Duck(boolean isMale) {
        this.isMale = isMale;
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }
}
