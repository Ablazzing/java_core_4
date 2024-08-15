package org.javaacademy.core.lesson7.animal_world_ex3.mammal;

/**
 * Собака
 */
public class Dog extends Mammal {
    private String ownerName;

    public Dog(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Лает
     */
    public void bark() {
        System.out.println("Собака лает");
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
