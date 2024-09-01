package org.javaacademy.core.homework.homework5.ex2;

public class Computer {
    private String username;

    /**
     * Вход пользователя
     */
    public void login(String username) {
        this.username = username;
    }


    /**
     * Выход пользователя
     */
    public void logout() {
        this.username = null;
    }

    /**
     * Отправка сообщения
     */
    public void sendMessage(String text) {
        if (this.username == null) {
            throw new RuntimeException("Пользователь не вошел в систему");
        }
        System.out.println("сообщение: " + text);
    }

    public String getUsername() {
        return username;
    }
}
