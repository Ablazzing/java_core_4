package org.javaacademy.core.lesson7.animal_world_ex3.fresh_water;

/**
 * Рыба
 */
public abstract class Fish extends FreshWater {
    //Максимальное количество икры у рыбы
    protected int maxCountCaviar;

    public Fish(int maxCountCaviar) {
        this.maxCountCaviar = maxCountCaviar;
    }
}
