package org.javaacademy.core;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        //Список студентов на курсе
        String[] students = new String[3];
        students[0] = "Сидоров";
        students[1] = "Иванов";
        students[2] = "Петров";

        //@1b28cdfa по ссылке находится объект - [ Сидоров, Иванов, Петров]
        System.out.println(Arrays.toString(students));

        //[Сидоров, Иванов, Петров]
        //System.out.println(students[4]); - Будет ошибка

        //[null, null, null] - при создании массива ставятся значения по умолчанию
        String[] secondStudents = new String[3];
        secondStudents[2] = "Козлов";
        System.out.println(Arrays.toString(secondStudents));
        System.out.println("___________________________________________");
        //Примитивы
        //boolean, byte, short, int, long, float, double, char
        boolean[] answers = new boolean[3];
        int[] numbers = new int[3];
        char[] chars = new char[3];
        System.out.println(Arrays.toString(answers));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(chars));

        //Ссылочный тип данных
        String myName = "Yuri";
        System.out.println(myName);

        char[] letters = {'а', 'б', 'c'};
        System.out.println(letters);

        //Длина массива
        System.out.println("Длина массива" +letters.length);
        System.out.println("___________________________________________");

        //Распечатать каждого студента на новой строке
        System.out.println("Распечатать каждого студента на новой строке");
        String[] studentsCopy = new String[3];
        studentsCopy[0] = "Сидоров";
        studentsCopy[1] = "Иванов";
        studentsCopy[2] = "Петров";

        for (String studentName : studentsCopy) {
            System.out.println(studentName);
        }

        System.out.println("___________________________________________");
        //Посчитать сумму покупок из магазина
       double[] orders = {2.5, 1.5, 2, 2};
       double sum = 0;

       for (double order : orders) {
           sum = sum + order;
       }
        System.out.println("Сумма заказа: " + sum);
       System.out.println("___________________________________________");

        System.out.println("Распечатать только четные цифры из рулетки");
       //Распечатать только четные цифры из рулетки
       int[] roulette = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

       for (int numberRoulette : roulette) {
           if (numberRoulette % 2 == 0) {
               System.out.println("Четное число: " + numberRoulette);
           }
       }
       System.out.println("___________________________________________");

       //Распечатать только первые 5 выпавших цифр
        System.out.println("Распечатать только первые 5 выпавших цифр рулетки");
        int[] rouletteResult = {36, 5, 10, 12, 1, 2, 7, 8};
//        int countIterations = 0;

//        for (int numberRoulette : rouletteResult) {
//            System.out.println(numberRoulette);
//            countIterations = countIterations + 1;
////            countIterations += 1;
////            countIterations++;
//            if (countIterations == 5) {
//                break;
//            }
//        }

        for (int index = 0; index < 5; index++) {
            System.out.println(rouletteResult[index]);
        }

        //8 - array.length
        //7
        //6
        //5
        //4
        //3
        System.out.println("___________________________________________");

        //Посчитать сумму последних 5 значений из рулетки
//        int sumResult = 0;
//        for (int index = rouletteResult.length - 1; index > rouletteResult.length - 6 ;index--) {
//            sumResult += rouletteResult[index];
//        }
//        System.out.println("Сумма последних 5 значений из рулетки: " + sumResult);

        //Пропустить первые 3 числа
        for (int index = 0; index < rouletteResult.length; index++) {
            if (index < 3) {
                continue;
            }
            System.out.println(rouletteResult[index]);
        }

//        for (int i = 0; true ; i++) {
//            System.out.println(i);
//            i--;
//        }

        System.out.println("___________________________________________");
        //Сумма чисел от 1 до ..
//        int countNumbers = 2;
//        int sumWhile = 2;
//        while (true) {
//            sumWhile *= countNumbers;
//            //countNumbers++;
//            if (countNumbers > 10) {
//                break;
//            }
//        }
//        System.out.println("Сумма чисел от 1 до 10: " + sumWhile);
        System.out.println("___________________________________________");
        //Сохранение результатов за несколько дней
        int[] day1 = {36, 2, 10, 17, 7};
        int[] day2 = {3, 5, 2, 9, 11};
        int[] day3 = {6, 9, 21, 33, 0};
        int[][] daysStatistics = new int[3][];
        daysStatistics[0] = day1;
        daysStatistics[1] = day2;
        daysStatistics[2] = day3;

        for (int[] day : daysStatistics) {
            System.out.println(Arrays.toString(day));
        }

        //Найти в статистике по всем дням число 9 - и распечатать "выпадала 9"
        array1:
        for (int[] day : daysStatistics) {
            for (int numberRoulette : day) {
                if (numberRoulette == 9) {
                    System.out.println("Выпадала 9");
                    break array1;
                }
            }
        }


    }
}
