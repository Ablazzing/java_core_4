package org.javaacademy.core.homework.homework4.ex4.herbivore;

import org.javaacademy.core.homework.homework4.ex4.ActionForDeadAliveException;
import org.javaacademy.core.homework.homework4.ex4.Alive;

/**
 * Травоядное
 */
public abstract class Herbivore extends Alive {

    public Herbivore(double weight) {
        super(weight);
    }

    protected void checkCanRun() {
        if (this.isDead) {
            throw new ActionForDeadAliveException("Животное не может бегать");
        }
    }

    public abstract void run();
}
