package org.javaacademy.core.lesson7.animal_world_ex3.mammal;

/**
 * Мышь
 */
public class Mouse extends Mammal {
    private int tailLength;

    public Mouse(int tailLength) {
        this.tailLength = tailLength;
    }

    /**
     * Ест сыр
     */
    public void eatCheese() {
        System.out.println("Мышь ест сыр");
    };
}
