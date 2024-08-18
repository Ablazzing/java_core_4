package org.javaacademy.core.lesson4;

/**
 * Класс Солдатик
 */
public class Soldier {
    String name; //Это свойство (Атрибут)
    int hp; //Это свойство (Атрибут)
    String title = "Рядовой"; //Это свойство (Атрибут)
    String[] artefacts; //Это свойство (Атрибут)

    //Конструктор
    public Soldier() {
        this.name = "Безымянный солдатик";
        this.hp = 100;
    }

    //Конструктор
    public Soldier(String newName, int newHp) {
        this.name = newName;
        setHp(newHp);
    }

    //Overload - перегрузка
    public Soldier(String newName, int newHp, String newTitle) {
        this.name = newName;
        setHp(newHp);
        this.title = newTitle;
    }

    //Функция = метод
    public void go() {
        System.out.println("Солдатик " + this.name + " идет вперед");
    }

    //Функция = метод
    public void fight(Soldier anotherSoldier) {
        if (this.hp > anotherSoldier.hp) {
            System.out.println("Победил " + this.name);
            anotherSoldier.setHp(0);
        } else {
            System.out.println("Победил " + anotherSoldier.name);
            this.setHp(0);
        }
    }

    public void takeArtefacts(String... artefacts) {
        //String[] artefacts
        this.artefacts = artefacts;
    }

    //Геттер (get - получать)
    public String[] getArtefacts() {
        return artefacts;
    }

    //Сеттер (set - устанавливать)
    public void setHp(int newHp) {
        if (newHp >= 0 && newHp <= 100) {
            this.hp = newHp;
        } else {
            System.out.println("Ошибка, не можем присвоить отрицательное здоровье");
        }
    }

    //Геттер (get - получать)
    public String getName() {
        return this.title + " " + this.name;
    }

    //Геттер (get - получать)
    public int getHp() {
        return hp;
    }

    //Геттер (get - получать)
    public String getTitle() {
        return title;
    }

    public void onFire() {
        //Мне нужно отнимать здоровье у солдатика по 1 до нуля.
        // Печать после каждого уменьшение его здоровье и крик "горю"
        while (true) {
            if (this.hp == 0) {
                //Завершение метода
                return;
            }
            this.setHp(this.hp - 1);
            System.out.println("Горю!");
            System.out.println("*Здоровье солдатика: " + this.hp);
        }
    }
}
