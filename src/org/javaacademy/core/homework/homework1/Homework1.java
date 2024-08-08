package org.javaacademy.core.homework.homework1;


import org.javaacademy.core.homework.homework1.oop_ex_5.CalcFinancialResult;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;
import static java.math.BigDecimal.valueOf;

public class Homework1 {
    public static void main(String[] args) {
        //ex2();
        System.out.println("___________________________________________");
         //ex3();
        System.out.println("___________________________________________");
        //ex4();
        advanced();
    }

    public static void ex1() {
        //Открыть класс Calc, там задание!
    }

    public static void ex2() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        String convertedName = name.trim().toUpperCase();
        if (convertedName.contains("ОВА ")) {
            System.out.println("Уважаемая " + convertedName);
        } else if (convertedName.contains("ОВ ")) {
            System.out.println("Уважаемый " + convertedName);
        } else {
            System.out.println("Неизвестное лицо " + convertedName);
        }
    }

    public static void ex3() {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
        //В ином случае, машина не должна запускаться

        //&&
        //true - 1
        //false - 0
        // 1 && 0 - 0
        // 1 && 1 - 1

        //Файл
        // чтение удаление изменение
        //  true   false    false
        //   1      0        0 - роль 1
        //  0      1         1 - роль 2
        // роль1 | роль2
        // 1        1       1 -> 8

        if (
                fuel >= 10
                && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                && !hasErrors
                && isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        //Работа на самостоятельное изучение функций класса String.
        //Заменить в строке 'this is' на 'those are',
        //получить индекс (число) второй буквы 'o' в строке. ПОЛУЧЕНИЕ ИНДЕКСА ЧЕРЕЗ ФУНКЦИЮ!
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        //String simply = "those are simply. This is my favorite song.";
        String converted = simply.replaceAll("this is", "those are");
        int firstIndex = converted.indexOf("o");
        int secondIndex = converted.indexOf("o", firstIndex + 1);
        System.out.println(secondIndex);
    }

    /**
     * Для продвинутых!
     * Принимается только при использовании класса BigDecimal в расчетах.
     */
    public static void advanced() {
        //Задача №4
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость(цена) 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000 - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб
        int countSausage = 2000;
        long countHam = 8511;
        long countNeck = 6988;

        CalcFinancialResult calcFinancialResult = new CalcFinancialResult("800", "350", "500");
        System.out.println("___________________________________________");
        System.out.println("Расчет №1");
        calcFinancialResult.calculateProfitTax(countSausage, countHam, countNeck);
        System.out.println("___________________________________________");
        System.out.println("Расчет №2");
        calcFinancialResult.calculateProfitTax(1000, 1000, 1000);

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 до 2_000_000, облагается ставкой 10%
        // прибыль до налогов до 1_000_000 (включительно), облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже всех товаров:

    }
}
