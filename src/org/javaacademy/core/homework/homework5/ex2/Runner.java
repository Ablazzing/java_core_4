package org.javaacademy.core.homework.homework5.ex2;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computerSpy = new ComputerSpy(computer);
        computerSpy.login("Юрий");
        computerSpy.sendMessage("ура");
        computerSpy.logout();
    }
}
