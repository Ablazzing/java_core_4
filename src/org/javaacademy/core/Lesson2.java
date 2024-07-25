package org.javaacademy.core;

public class Lesson2 {
    public static void main(String[] args) {
        int money = 51;
        boolean isBlackBread = true;
        //boolean result = money > 100;
        if (money == 100) {
            if (isBlackBread) {
                System.out.println("Покупаю дорогой черный хлеб");
            } else {
                System.out.println("Покупаю дорогой белый хлеб");
            }
        } else if (money > 50) {
            System.out.println("Покупаю хлеб средней стоимости");
        } else {
            System.out.println("Покупаю дешевый хлеб");
        }

        //Операторы числового сравнения
        //> - больше
        //< - меньше
        //>= - больше или равно
        //<= - меньше или равно
        //== - равно
        //!= - не равно
        System.out.println("___________________________________________");

        int money2 = 150; //количество моих денег
        int breadPrice = 120; //стоимость хлеба
        int waterPrice = 20; //стоимость воды
        boolean result2 = (breadPrice + waterPrice) <= money2;
        if (  result2 ) {
            System.out.println("Покупаю хлеб и воду");
        } else {
            System.out.println("Не покупаю не то, не другое");
        }
        System.out.println("___________________________________________");

        //Логическое или - ||
        //Если true или(||) true -> true
        //Если true или(||) false -> true
        //Если false или(||) false -> false

        int breadPrice2 = 110; //стоимость хлеба
        int waterPrice2 = 20; //стоимость воды
        if (breadPrice2 > 100 || waterPrice2 > 15) {
            System.out.println("Выхожу из магазина, у вас дорого!");
        } else {
            System.out.println("Иначе остаюсь и покупаю товары");
        }

        //Логическое и - &&
        //Если true и(&&) true -> true
        //Если true и(&&) false -> false
        //Если false и(&&) false -> false
        if (breadPrice2 > 110 && breadPrice2 < 120) {
            System.out.println("Есть хлеб от 110 до 120");
        } else {
            System.out.println("Нет хлеба от 110 до 120");
        }
        System.out.println("___________________________________________");

        boolean isRed = true;
        boolean isGreen = false;
        boolean isCar = false;

        if (isRed || isCar) {
            System.out.println("У тебя есть что то красное или машинка, я с тобой дружу");
        } else {
            System.out.println("У тебя нет красной машинки, я с тобой не дружу");
        }

        System.out.println("___________________________________________");
        boolean isOlderThan18 = false;
        if (!isOlderThan18) {
            System.out.println("Я старше 18");
        } else {
            System.out.println("Я младше или равно 18");
        }

        System.out.println("___________________________________________");
        String name1 = "Юрий";
        String name2 = "Юрий Петрович";
        if (name1.equals(name2)) {
            System.out.println("Имена равны");
        } else {
            System.out.println("Имена не равны");
        }


    }
}
