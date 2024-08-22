package org.javaacademy.core.lesson10.ex4;

import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        String projectPath = "E:\\repos\\java_core_4";
        String fileName = "lesson10.txt";
        String path = projectPath + "\\" + fileName;

        try (FileWriter fileWriter = new FileWriter(path, true);) {
            fileWriter.write("У меня 10 урок идет сейчас");
        }

    }

    private static void ex1() throws IOException {
        String projectPath = "E:\\repos\\java_core_4";
        String fileName = "lesson10.txt";
        String path = projectPath + "\\" + fileName;
        FileWriter fileWriter = new FileWriter(path);
        try {
            if (true) {
                throw new RuntimeException("Какая ошибка");
            }
            fileWriter.write("У меня 10 урок идет сейчас");
        } finally {
            fileWriter.close();
        }

    }
}
