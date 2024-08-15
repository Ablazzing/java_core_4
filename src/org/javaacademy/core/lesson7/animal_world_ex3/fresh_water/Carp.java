package org.javaacademy.core.lesson7.animal_world_ex3.fresh_water;

/**
 * Карп
 */
public class Carp extends Fish {
    private String color;

    public Carp(int maxCountCaviar, String color) {
        super(maxCountCaviar);
        this.color = color;
    }

    @Override
    void swim() {
        System.out.println("Карп плывет умеренно");
    }
}
