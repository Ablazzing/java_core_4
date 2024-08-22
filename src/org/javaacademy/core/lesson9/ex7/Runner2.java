package org.javaacademy.core.lesson9.ex7;

public class Runner2 {
    public static void main(String[] args) {
        //Распечатывать строку, отнимая последнюю букву
        //abcde
        //abcd
        //abc
        //ab
        //a
        printRecursion("abcde");
    }

    private static void printRecursion(String text) {
        System.out.println(text);
        if (text.length() > 0) {
            printRecursion(text.substring(0, text.length() - 1));
        }
    }
}
