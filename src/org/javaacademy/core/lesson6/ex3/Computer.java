package org.javaacademy.core.lesson6.ex3;

public class Computer {

    //Перегрузка метода
    public void sayHello() {
        System.out.println("Привет");
    }

    //Перегрузка метода
    public String sayHello(String name) {
        System.out.println("Привет " + name);
        return "Привет " + name;
    }

    //Перезапись
    @Override
    public String toString() {
        return "Это компьютер";
    }
}
