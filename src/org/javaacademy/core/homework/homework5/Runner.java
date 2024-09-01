package org.javaacademy.core.homework.homework5;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.math.BigDecimal.ZERO;

public class Runner {
    private static final int MONEY_FIELD_INDEX = 1;
    private static final int COUNTRY_FIELD_INDEX = 0;
    private static final int MINIMUM_FIELDS_COUNT = 2;
    private static final String DELIMITER = ";";

    public static void main(String[] args) throws FileNotFoundException {
        ex1();
    }

    private static void ex1() {
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        BigDecimal[] moneyForCountry = new BigDecimal[countries.length];
        Arrays.fill(moneyForCountry, ZERO);

        String filename = "donation.csv";
        try (Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));) {
            readAllLines(scanner, moneyForCountry, countries);
        }
        System.out.println("Список пожертвований по странам");
        for (int i = 0; i < countries.length; i++) {
            System.out.printf("%s - %s\n", countries[i], moneyForCountry[i]);
        }
    }

    private static void readAllLines(Scanner scanner, BigDecimal[] moneyForCountry, String[] countries ) {
        scanner.nextLine();
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            BigDecimal moneyFromCountry = getNumberFromLine(text);
            addMoneyToCountryResult(countries, moneyForCountry, moneyFromCountry, getCountryName(text));
        }
    }

    private static String getCountryName(String textLine) {
        String[] fields = textLine.split(DELIMITER);
        if (fields.length == 0) {
            return "";
        }
        return fields[COUNTRY_FIELD_INDEX];
    }

    private static void addMoneyToCountryResult(String[] countries,
                                                BigDecimal[] countryResults,
                                                BigDecimal moneyFromCountry,
                                                String countryName) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals(countryName)) {
                countryResults[i] = countryResults[i].add(moneyFromCountry);
            }
        }
    }

    private static BigDecimal getNumberFromLine(String textLine) {
        String[] fields = textLine.split(DELIMITER);
        if (fields.length >= MINIMUM_FIELDS_COUNT && isNumber(fields[MONEY_FIELD_INDEX])) {
            String convertedMoney = fields[MONEY_FIELD_INDEX].replace(",", ".");
            return new BigDecimal(convertedMoney);
        }
        return ZERO;
    }

    private static boolean isNumber(String text) {
        Pattern pattern = Pattern.compile("^\\d+,\\d+$");
        return pattern.matcher(text).find();
    }

    private static void ex2() {
        //Сделать компьютерного шпиона
        //Смысл задания - отслеживать действия реального объекта и записывать их в лог
        //Создать компьютер:
        //1. Компьютер хранит в себе пользователя, который вошел в компьютер
        //2. Компьютер умеет:
        //2.1. Делать вход пользователя (на вход имя пользователя).
        // Изменяет пользователя, который зашел в компьютер
        //2.2 Делать выход пользователя. Удаляет пользователя из системы
        //2.3. Отправляет сообщение (на вход текст сообщения).
        // Печатает на экран "сообщение: {текст сообщения}".

        //Создать компьютерного шпиона, который наследуется от компьютера,
        // при этом хранит в себе обычный компьютер
        //Сделать так, чтобы при вызове методов компьютерного шпиона:
        //1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
        // и вызывался метод компьютера.
        //2. При выходе делалась запись в comp.log "Пользователь вышел"
        //3. При отправке сообщения, делалась запись в comp.log:
        // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
        // и вызвался метод компьютера.

        //Создать Runner
        //1. В нем создать компьютер.
        //2. Создать шпиона с компьютером из пункта 1
        //3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
        //4. Проверить наличие логов в comp.log
        // (файл должен быть внутри репозитория и отправлен в удаленное репо)
    }
}
