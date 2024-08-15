package org.javaacademy.core.lesson7.animal_world_ex3.mammal;

import org.javaacademy.core.lesson7.animal_world_ex3.Breathe;

/**
 * Млекопитающее
 */
public abstract class Mammal implements Breathe {

    /**
     * Кормит молоком
     */
    public void feedMilk() {
        System.out.println("Кормит молоком");
    }

    @Override
    public void breathe() {
        System.out.println("Животное дышит атмосферой");
    }
}
