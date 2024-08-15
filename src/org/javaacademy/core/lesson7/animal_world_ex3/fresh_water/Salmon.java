package org.javaacademy.core.lesson7.animal_world_ex3.fresh_water;

/**
 * Лосось
 */
public class Salmon extends Fish {

    public Salmon(int maxCountCaviar) {
        super(maxCountCaviar);
    }

    @Override
    void swim() {
        System.out.println("Лосось плывет против течения");
    }
}
