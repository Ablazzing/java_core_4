package org.javaacademy.core.lesson7.animal_world_ex3.fresh_water;

import org.javaacademy.core.lesson7.animal_world_ex3.Breathe;

/**
 * Пресноводное животное
 */
public abstract class FreshWater implements Breathe {

    /**
     * Плавает
     */
    abstract void swim();

    @Override
    public void breathe() {
        System.out.println("Дышит жабрами");
    }
}
