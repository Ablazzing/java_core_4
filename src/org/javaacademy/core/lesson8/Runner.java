package org.javaacademy.core.lesson8;

public class Runner {
    public static void main(String[] args) {

        try {
            String myName = null;
            //myName.toLowerCase();
            System.out.println(1 / 0);
        } catch (NullPointerException e) {

        }

        try {
            calc(1, 0);
        } catch (Exception e) {
            System.out.println("У нас произошла ошибка, но мы двигаемся дальше!");
        }

        System.out.println("Следующая операция!");
    }

    private static void calc(int number1, int number2) {
        System.out.println(number1 / number2);
    }
}
