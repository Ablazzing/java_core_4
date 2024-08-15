package org.javaacademy.core.lesson7.animal_world_ex3;

import org.javaacademy.core.lesson7.animal_world_ex3.fresh_water.Carp;
import org.javaacademy.core.lesson7.animal_world_ex3.fresh_water.Fish;
import org.javaacademy.core.lesson7.animal_world_ex3.fresh_water.FreshWater;
import org.javaacademy.core.lesson7.animal_world_ex3.fresh_water.Salmon;
import org.javaacademy.core.lesson7.animal_world_ex3.mammal.Dog;
import org.javaacademy.core.lesson7.animal_world_ex3.mammal.Mammal;
import org.javaacademy.core.lesson7.animal_world_ex3.mammal.Mouse;

public class Runner {
    public static void main(String[] args) {
        //Воссоздать цепочку в джава
        //                 Умеет дышать
        //         /                             \
        // млекопитающее(умеет кормить молоком)   пресноводное (умеет плавать)
        // /                        \                   \
        // крыса (есть сыр)        собака (лаять)       рыба
        //                                             /    \
        //                                          Карп      Лосось

        //Крыса обладает длиной хвоста
        //Собака обладает хозяином
        //Рыба - обладает макс количеством икры
        Mammal mouse = new Mouse(20);
        Mammal dog = new Dog("Ivan");
        FreshWater carp = new Carp(10_000, "black");
        Fish salmon = new Salmon(20_000);

        Breathe[] breathes = {mouse, dog, carp, salmon};
        for (Breathe object : breathes) {
            object.breathe();
        }
    }
}
