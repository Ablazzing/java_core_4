package org.javaacademy.core.homework.homework5.ex2;

import java.io.FileWriter;
import java.io.IOException;

public class ComputerSpy extends Computer {
    private static final String FILENAME = "comp.log";
    private final Computer computer;

    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void login(String username) {
        writeToLog("Начало операции: вход пользователя".formatted(username));
        computer.login(username);
        writeToLog("Пользователь %s вошел".formatted(username));
    }

    @Override
    public void logout() {
        writeToLog("Пользователь вышел");
        computer.logout();
    }

    @Override
    public void sendMessage(String text) {
        writeToLog("Пользователь %s отправил сообщение %s".formatted(computer.getUsername(), text));
        computer.sendMessage(text);
    }

    private void writeToLog(String text) {
        try (FileWriter fileWriter = new FileWriter(FILENAME, true)) {
            fileWriter.write(text + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
