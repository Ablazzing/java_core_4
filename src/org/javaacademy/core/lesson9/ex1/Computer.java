package org.javaacademy.core.lesson9.ex1;

public class Computer {
    private Calculator calculator;

    public Computer(Calculator calculator) {
        this.calculator = calculator;
    }

    public void printSum(int number1, int number2) {
        System.out.println(calculator.sum(number1, number2));
    }
}
