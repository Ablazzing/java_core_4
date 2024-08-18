package org.javaacademy.core.lesson5.car;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(1_200, "Легковая");
        Car car2 = new Car("Грузовая");
        car.turnButton();
//        System.out.println("Вес машины: " + car.getWeight());
//        System.out.println("Вес машины: " + car2.getWeight());
        //car.runEngine();
        //car.printInfo();
        System.out.println(car);

//        final int number = 10;
//        number += 1;
//        System.out.println(number);


    }
}
