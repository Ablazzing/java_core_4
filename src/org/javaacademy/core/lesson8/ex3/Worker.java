package org.javaacademy.core.lesson8.ex3;

/**
 * Лесоруб
 */
public class Worker {
    private Axe axe;
    private boolean isDrunk = false;

    public Worker(Axe axe) {
        this.axe = axe;
    }

    /**
     * Рубить
     */
    public void chop() throws AxeIsBrokenException, WorkerIsDrunkException {
        if (axe.isBroken()) {
            throw new AxeIsBrokenException("Топор сломан!");
        }
        if (isDrunk) {
            throw new WorkerIsDrunkException("Лесоруб пьян и не может работать");
        }
        System.out.println("Дерево срублено");
    }

    public void drink() {
        isDrunk = true;
    }
}
