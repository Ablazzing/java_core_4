package org.javaacademy.core;

public class Lesson1 {
    public static void main(String... args) {
        System.out.println("Привет мир!");

        //ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ (хранятся в виде числа)
        //1 - есть сигнал
        //0 - отсутствие сигнала
        //bit - кусочек
        boolean hasSignal = true; //1
        boolean noSignal = false; // 0

        //Целые числа
        //байт -128 - 127
        byte ipAddress = 127;
        byte ipaddress = -128;

        //Короткое число
        //-32_768 до 32_767 - 2 байта
        short number = 32_767;
        short minNumber = -32_768;

        //Целое число по умолчанию
        //4 байта
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        //Длинное целое число
        //8 байт
        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775808L;

        //Математические операции
        int number1 = 10;
        int number2 = 3;
        System.out.println("Операция сложения:" + (number1 + number2));
        int minusResult = number1 - number2;
        System.out.println("Операция вычитания:" + minusResult);
        System.out.println("Операция Деления:" + (number1 / number2));
        System.out.println("Операция умножения:" + (number1 * number2));

        //Дробные числа
        //float - число с плавающей точкой 32 битное (4 байта)
        float dollarRate = 88.6F;
        System.out.println("Сколько знаков после запятой может быть: " + 1.1234567890F);

        //dobule - число с плавающей точкой 64 битное (8 байт)
        //8 байт - 64 бита
        System.out.println("Сколько знаков после запятой может быть DOUBLE: " + 1.123456789012345678901234);

        //символ - содержит в себе код символа, преобразование в "букву" происходит согласно таблице кодировок
        char randomSymbol = 'K';
        //136 - k
        //138 - m
        System.out.println("Печать символа: " + randomSymbol);

        //String - текст. НЕ ЯВЛЯЕТСЯ ПРИМИТИВНЫМ ТИПОМ ДАННЫХ. ИМЕЕТ ФУНКЦИИ.
        String text = "Это какой то текст";
        System.out.println(text);

        //Перевести текст в нижний регистр
        System.out.println("Текст в нижнем регистре:" + text.toLowerCase());

        //Перевести текст в верхний регистр
        System.out.println("Текст в верхнем регистре:" + text.toUpperCase());

        //Поиск подстроки
        String name = "Юрий";
        String nameLowerCase = name.toLowerCase(); // Имя в нижнем регистре
        boolean isNameContains = nameLowerCase.contains("ю");
        System.out.println("Содержит ли имя Юрий букву ю: " + isNameContains);

        //Повторения текста n раз
        System.out.println("___________________________________________");
        String nameFiftyTimes = name.repeat(50);
        System.out.println("Юрий 50 раз:" + nameFiftyTimes);
        System.out.println("___________________________________________");

        //Обрезка строки
        String anotherText = "Привет. Меня зовут Витя!";
        String substring = anotherText.substring(0, 6);
        System.out.println("Первые 6 символов из текста: " + substring);

        //Длина предложения
        int anotherTextLength = anotherText.length();
        System.out.println("Длина предложения: " + anotherTextLength);

        //Обрезка пробелов
        String textWithBlanks = "     это текст с пробелами      ";
        String textWithoutBlanks = textWithBlanks.trim();
        System.out.println("Обрезка строки от пробелов: " + textWithoutBlanks);

        //Объединение строк - конкатенация
        String firstName = "Юрий";
        String secondName = "Молодыко";
        System.out.println("Конкатенация:" + firstName + " " + secondName);

    }
}
