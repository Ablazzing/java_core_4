package org.javaacademy.core.homework.homework4.ex4;

public class ActionForDeadAliveException extends RuntimeException {

    public ActionForDeadAliveException() {
        super("Животное мертво и не может делать действие");
    }

    public ActionForDeadAliveException(String message) {
        super(message);
    }
}
