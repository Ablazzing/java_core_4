package org.javaacademy.core.homework.homework4.ex4.predator;

import org.javaacademy.core.homework.homework4.ex4.ActionForDeadAliveException;
import org.javaacademy.core.homework.homework4.ex4.Alive;

public abstract class Predator extends Alive {
    private static final int COEFFICIENT_WEIGHT_FOR_EAT = 3;

    public Predator(double weight) {
        super(weight);
    }

    /**
     * Атака на другое существо
     * @param alive - Другое живое существо
     */
    public void attack(Alive alive) {
        if (this.isDead) {
            throw new ActionForDeadAliveException();
        }

        if (canAttack(alive)) {
            this.dead();
        } else {
            alive.dead();
            this.weight = weight + alive.getWeight() / COEFFICIENT_WEIGHT_FOR_EAT;
        }
    }

    protected boolean canAttack(Alive alive) {
        return this.weight < alive.getWeight();
    }
}
