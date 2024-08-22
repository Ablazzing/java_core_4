package org.javaacademy.core.lesson9.ex7;

public class Runner3 {
    public static void main(String[] args) {
        Human human = new Human("Юрий");
        Human human2 = new Human("Иван");
        human.greetings(human2);
    }
}
