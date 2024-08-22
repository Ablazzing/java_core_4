package org.javaacademy.core.lesson10.ex5;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        try (InputStream inputStream = Runner.class.getClassLoader().getResourceAsStream("config.txt");
             Scanner scanner = new Scanner(inputStream);) {
            System.out.println(scanner.nextLine());
        };
    }
}
