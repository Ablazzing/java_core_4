package org.javaacademy.core.homework.homework2.office.worker;

public class Boss extends WorkerWithName {

    public Boss(String name) {
        super(name);
    }

    public void shoutOnManager(Manager manager) {
        //System.out.println(manager.getName() + " быстрее!");
        System.out.printf("%s быстрее!\n", manager.getName());
    }

}
