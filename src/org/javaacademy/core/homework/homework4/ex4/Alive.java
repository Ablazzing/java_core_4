package org.javaacademy.core.homework.homework4.ex4;

public abstract class Alive {
    public static final String DOMEN = "ЦАРСТВО ЖИВЫХ";
    protected boolean isDead = false; //Мертвый или нет
    protected double weight;

    public Alive(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void dead() {
        this.isDead = true;
    }

    //non static attribute
    //private -
    //protected -
    //default - x
    //public - x

    //static attribute
    //private -
    //protected -
    //default - x
    //public -
}
