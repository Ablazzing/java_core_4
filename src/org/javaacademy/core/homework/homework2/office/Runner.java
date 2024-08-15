package org.javaacademy.core.homework.homework2.office;

import org.javaacademy.core.homework.homework2.office.worker.Boss;
import org.javaacademy.core.homework.homework2.office.worker.Guard;
import org.javaacademy.core.homework.homework2.office.worker.Manager;
import org.javaacademy.core.homework.homework2.office.worker.Secretary;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Михалыч");
        Manager manager = new Manager("Петя");
        Guard guard = new Guard("Алексеич");
        Secretary secretary = new Secretary();
        Office office = new Office(boss, manager, secretary, guard);
        office.workDay();
    }
}
