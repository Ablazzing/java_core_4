package org.javaacademy.core.homework.homework2.office.worker;

public abstract class WorkerWithName {
    protected final String name;

    public WorkerWithName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
