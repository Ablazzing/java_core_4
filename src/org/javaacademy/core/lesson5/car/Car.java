package org.javaacademy.core.lesson5.car;

public class Car {
    private static final String ENGINE_START = "Двигатель запущен";

    //Вес машины
    private int weight = 1000;
    //Тип машины
    private final String carType;

    public Car(String carType) {
        this.carType = carType;
    }

    public Car(int weight, String carType) {
        this.weight = weight;
        this.carType = carType;
    }

    public void printInfo() {
        System.out.println("Тип машины: " + this.carType + "\nВес машины: "
                           + this.weight);
    }

    @Override
    public String toString() {
        return "Car{" +
               "weight=" + weight +
               ", carType='" + carType + '\'' +
               '}';
    }

    /**
     * Запуск машины
     */
    public void turnButton() {
        this.runEngine();
        this.turnLights();
    }

    /**
     * Запуск двигателя
     */
    private void runEngine() {
        System.out.println(ENGINE_START);
    }

    /**
     * Включение фар
     */
    public void turnLights() {
        System.out.println("Фары включены");
    }

    public int getWeight() {
        return weight;
    }
}
