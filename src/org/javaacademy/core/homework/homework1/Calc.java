package org.javaacademy.core.homework.homework1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");
        String operand = scanner.nextLine();

        System.out.println("Введите второе число");
        double number2 = Double.parseDouble(scanner.nextLine());

        if (operand.equals("+")) {
            System.out.println(number1 + number2);
        } else if (operand.equals("-")) {
            System.out.println(number1 - number2);
        } else if (operand.equals("*")) {
            System.out.println(number1 * number2);
        } else if (operand.equals("/")) {
            if (number2 == 0) {
                throw new ArithmeticException("Ошибка деления на ноль");
            }
            System.out.println(number1 / number2);
        } else {
            System.out.println("Ошибка");
        }


        scanner.close();
    }
}
