package org.javaacademy.core.homework.homework3.shop;

/**
 * Магазин
 */
public class Shop {
    boolean isClearFloor; //Чистый пол
    boolean workersHasBadge; //Есть ли бейджики у сотрудников
    int countWorkers; //Количество работников в магазине

    private Shop(boolean isClearFloor, boolean workersHasBadge, int countWorkers) {
        this.isClearFloor = isClearFloor;
        this.workersHasBadge = workersHasBadge;
        this.countWorkers = countWorkers;
    }
}
