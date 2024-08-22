package org.javaacademy.core.lesson10.ex1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //Вывод информации
        //System.out.println("Печать какой то информации");

        //Ввод информации
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        System.out.println("Введенная информация: " + inputData);
        scanner.close();
    }
}
