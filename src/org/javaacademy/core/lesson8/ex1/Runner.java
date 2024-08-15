package org.javaacademy.core.lesson8.ex1;

public class Runner {
    public static void main(String[] args)  {
        Car car = new Car(0);
        try {
            car.go();
            System.out.println("Машина в порядке, поэтому едем на моря");
        } catch (Exception e) {
            System.out.println("С машиной что то не так, едем на моря на поезде");
        }


    }
}
