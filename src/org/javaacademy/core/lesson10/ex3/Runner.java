package org.javaacademy.core.lesson10.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        //Считать из файла numbers.txt данные, просуммировать нечетные строки
        String filename = "E:\\repos\\java_core_4\\numbers.txt";
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int countLine = 1;
        int totalSum = 0;
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            if (countLine % 2 != 0) {
                Integer number = Integer.valueOf(nextLine);
                totalSum += (int) number;
            }
            countLine++;
        }
        System.out.println(totalSum);

        scanner.close();
    }
}
