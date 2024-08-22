package org.javaacademy.core.lesson9.ex2;

public class Human {
    private Hand leftHand = new Hand();
    private Hand rightHand = new Hand();

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    /**
     * Вложенный НЕстатический класс (не может существовать без экземпляра класса выше)
     */
    public class Hand {

    }

    @Override
    public String toString() {
        return "Human{" +
               "leftHand=" + leftHand +
               ", rightHand=" + rightHand +
               '}';
    }
}
