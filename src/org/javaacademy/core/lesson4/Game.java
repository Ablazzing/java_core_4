package org.javaacademy.core.lesson4;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        //Создание солдата
        Soldier soldierPetr = new Soldier("Petr", 100);
        Soldier soldierIvan = new Soldier("Ivan", 90);
        //Запись свойства
        //soldierPetr.name = "Petr";
        //soldierPetr.hp = 100;

        System.out.println("Имя солдата: " + soldierPetr.getName());
        System.out.println("Количество здоровья: " + soldierPetr.getHp());

        System.out.println("Имя солдата: " + soldierIvan.getName());
        System.out.println("Количество здоровья: " + soldierIvan.getHp());
        //soldierPetr.go();
        //soldierIvan.go();
        System.out.println("___________________________________________");
        soldierPetr.fight(soldierIvan);

        //soldierPetr.onFire();

        System.out.println("___________________________________________");
        Soldier soldier = new Soldier("Михаил", 100, "Генерал");
        System.out.println("Звание: " + soldier.title);

        Soldier yuriSoldier = new Soldier("Юрий", 110);
        System.out.println("Звание: " + yuriSoldier.title);

        System.out.println("___________________________________________");
        Soldier soldier1 = new Soldier();
        System.out.println("Значение имени для солдатика по умолчанию: " + soldier1.getName());
        String artefact1 = "меч";
        String artefact2 = "пистолет";
        soldier1.takeArtefacts(artefact1, artefact2);
        String[] artefacts = soldier1.getArtefacts();

        System.out.println(Arrays.toString(soldier1.getArtefacts()));
    }
}
