package org.javaacademy.core.homework.homework2.office;

import org.javaacademy.core.homework.homework2.office.worker.Boss;
import org.javaacademy.core.homework.homework2.office.worker.Guard;
import org.javaacademy.core.homework.homework2.office.worker.Manager;
import org.javaacademy.core.homework.homework2.office.worker.Secretary;

public class Office {
    private final Boss boss;
    private final Manager manager;
    private final Secretary secretary;
    private final Guard guard;

    public Office(Boss boss, Manager manager, Secretary secretary, Guard guard) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.guard = guard;
    }

    public void workDay() {
        boss.shoutOnManager(manager);
        manager.shout();
        guard.giveMeHalfSalary();
        secretary.keepCalm(boss, manager, guard);
    }
}
