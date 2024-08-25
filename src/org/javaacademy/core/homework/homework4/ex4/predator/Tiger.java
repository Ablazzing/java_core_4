package org.javaacademy.core.homework.homework4.ex4.predator;

import org.javaacademy.core.homework.homework4.ex4.Alive;

public class Tiger extends Predator {
    private static final int TIGER_ATTACK_AGILE_MODIFICATION = 2;

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    protected boolean canAttack(Alive alive) {
        return this.weight * TIGER_ATTACK_AGILE_MODIFICATION < alive.getWeight();
    }
}
