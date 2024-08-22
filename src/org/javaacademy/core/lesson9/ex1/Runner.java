package org.javaacademy.core.lesson9.ex1;

public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //System.out.println(calculator.sum(2, 5));
        CalculatorFake calculatorFake = new CalculatorFake();

        Computer computer = new Computer(calculator);
        computer.printSum(2, 5);
    }
}
