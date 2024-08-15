package org.javaacademy.core.lesson8.ex2;

public class Runner {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("hello");
        } catch (RuntimeException e) {
            System.out.println("Обработали ошибку!");
        }

    }
}
