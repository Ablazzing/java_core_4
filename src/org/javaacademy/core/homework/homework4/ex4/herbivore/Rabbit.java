package org.javaacademy.core.homework.homework4.ex4.herbivore;

import org.javaacademy.core.homework.homework4.ex4.ActionForDeadAliveException;

/**
 * Кролик
 */
public class Rabbit extends Herbivore {
    public Rabbit(double weight) {
        super(weight);
    }

    @Override
    public void run() {
        checkCanRun();
        System.out.println("Кролик быстро бежит");
    }
}
