package org.javaacademy.core.homework.homework4.ex4.herbivore;

import org.javaacademy.core.homework.homework4.ex4.ActionForDeadAliveException;

/**
 * Слон
 */
public class Elephant extends Herbivore {
    public Elephant(double weight) {
        super(weight);
    }

    @Override
    public void run() {
        checkCanRun();
        System.out.println("Слон бежит медленно");
    }
}
