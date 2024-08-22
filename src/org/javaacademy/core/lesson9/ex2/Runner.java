package org.javaacademy.core.lesson9.ex2;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        Human.Hand leftHand = human.getLeftHand();
        human = null;
        System.out.println(leftHand);
    }
}
