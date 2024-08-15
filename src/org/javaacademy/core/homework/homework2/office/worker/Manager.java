package org.javaacademy.core.homework.homework2.office.worker;

public class Manager extends WorkerWithName {

    public Manager(String name) {
        super(name);
    }

    public void shout() {
        System.out.println("я ничего не успеваю, помогите!");
    }
}
